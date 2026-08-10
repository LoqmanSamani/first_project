import java.util.Scanner;
import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.sound.sampled.*;


public class AlarmClock{
        public static void main(String[] args){
                // alarm clock
                boolean alarmSet = false;
                LocalTime alarmTime = null;
                int frequency = 1;
                int repeatPeriod = 60000; // one minute: 60000 milliseconds

                String filePath = "alarm.wav";
                File file = new File(filePath);

                Scanner sc = new Scanner(System.in);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

                // get alarm settings from user
                try {
                        System.out.print("Enter the alarm time (HH:mm): ");
                        String input = sc.nextLine();
                        alarmTime = LocalTime.parse(input, formatter);
                        alarmSet = true;

                        System.out.print("How many times should the alarm be repeated: ");
                        frequency = sc.nextInt();
                        sc.nextLine();
                        if (frequency <= 0){
                                throw new IllegalArgumentException("Repetition count must be greater than 0.");
                        }

                        System.out.print("Enter interval time between repetitions (in seconds): ");
                        int intervalSeconds = sc.nextInt();
                        sc.nextLine();
                        if (intervalSeconds < 0){
                                throw new IllegalArgumentException("Interval cannot be negative.");
                        }
                        repeatPeriod = intervalSeconds * 1000;
                }
        catch (DateTimeParseException e){
                        System.out.println("Invalid time. Please use HH:mm format.");
                        alarmSet = false;
                }
        catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                        alarmSet = false;
                }
        catch (Exception e){
                        System.out.println("Something went wrong!");
                        alarmSet = false;
                }

                //wait for alarm time
                while (alarmSet){
                        LocalTime now = LocalTime.now();
                        
                        // compare hour and minute
                        if (now.getHour() == alarmTime.getHour() && now.getMinute() == alarmTime.getMinute()){
                                for (int i = 0; i < frequency; i++){
                                        try {
                                                AudioInputStream audio = AudioSystem.getAudioInputStream(file);
                                                Clip clip = AudioSystem.getClip();
                                                clip.open(audio);
                                                clip.loop(Clip.LOOP_CONTINUOUSLY); // Ring continuously

                                                System.out.println("Alarm ringing! Press Enter to stop, or ignore to repeat...");
                                                long ringDuration = 20000; // 12 seconds active ringing time
                                                long startTime = System.currentTimeMillis();
                                                boolean stoppedByUser = false;

                                                while (System.currentTimeMillis() - startTime < ringDuration){
                                                        if (System.in.available() > 0) {
                                                                sc.nextLine(); // Consume keypress
                                                                stoppedByUser = true;
                                                                break;
                                                        }
                                                        Thread.sleep(100);
                                                }

                                                clip.stop();
                                                clip.close();
                                                audio.close();

                                                if (stoppedByUser) {
                                                        alarmSet = false;
                                                        System.out.println("Alarm stopped by user.");
                                                        break;
                                                }
                                        }
                        catch (UnsupportedAudioFileException e){
                                                        System.out.println("Audio file is not supported!");
                                                        alarmSet = false;
                                                        break;

                                                }
                        catch (LineUnavailableException e){
                                                        System.out.println("Unable to access audio source!");
                                                        alarmSet = false;
                                                        break;

                                                }
                        catch (Exception e){
                                                        System.out.println("Error playing the alarm!");
                                                        alarmSet = false;
                                                        break;
                                                }

                                        if (i < frequency - 1){
                                                try {
                                                        Thread.sleep(repeatPeriod);

                                                }
                        catch (InterruptedException e){
                                                        System.out.println("Alarm interrupted!");
                                                        Thread.currentThread().interrupt();
                                                        alarmSet = false;
                                                        break;
                                                }
                                        }
                                }
                                alarmSet = false;
                        }

                        try {
                                Thread.sleep(1000);

                        }
            catch (InterruptedException e){
                                System.out.println("Alarm interrupted!");
                                Thread.currentThread().interrupt();
                                alarmSet = false;
                        }
                }

                sc.close();
        }
}
