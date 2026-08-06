import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.sound.sampled.*;

public class AudioPlayer {
    public static void main(String[] args) {
	
	// audio player
        String filePath = "chopi.wav";
        File file = new File(filePath);

        try (Scanner sc = new Scanner(System.in); 
	
	     AudioInputStream audio = AudioSystem.getAudioInputStream(file);
             Clip clip = AudioSystem.getClip()){

		clip.open(audio);
            	String response = "";

		while(!response.equals("Q")){

			System.out.println("P : Play");
			System.out.println("S : Stop");
			System.out.println("R : Reset");
			System.out.println("Q : Quit");
			System.out.print("Enter your choise: ");
			response = sc.next().toUpperCase();

			switch (response){

				case "S" -> clip.start();
				case "P" -> clip.stop();
				case "R" -> clip.setMicrosecondPosition(0);
				case "Q" -> clip.close();
				default  -> System.out.println("Invalid choise!");
			}
		}
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported!");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio source!");
        } catch (IOException e) {
            System.out.println("Error reading the audio file!");
        }
	finally{
		System.out.println("Bye!");
	}
    }
}

