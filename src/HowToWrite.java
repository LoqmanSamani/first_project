import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class HowToWrite{
	public static void main(String[] args){
		// how to write a file in java
		// there are four popular methods
		// FileWriter: good for small to medium sized text files
		// BufferedWriter: better performance for large sized text files
		// PrintWriter: best for structured data, like reports or logs
		// FileOutputStream: best for binary files (e.g., images, audio files)

		// FileWriter
		try(FileWriter w = new FileWriter("filewriter_example.txt")){
			w.write("Hello from FileWriter!\n");
			w.write("a simple example of how to use FileWriter!\n");
			System.out.println("filewriter_example.txt has been successfully created!");
		}catch(IOException e){
			e.printStackTrace();
		}

		// BufferedWriter
		try(BufferedWriter w = new BufferedWriter(new FileWriter("bufferedwriter_example.txt"))){
			w.write("Hello from BufferedWriter!");
			w.newLine();
			w.write("Buffering reduces expensive I/O operations on large datasets.");
			System.out.println("bufferedwriter_example.txt has been successfully created!");
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		// PrintWriter
		try(PrintWriter w = new PrintWriter(new FileWriter("printwriter_example.txt"))){
			String items = "item";
			double price = 12.4;
			int quantity = 4;
			System.out.println("*** Sales report ***");
			w.printf("Item: %s | Qty: %d | Total: $%.2f%n", items, quantity, quantity*price);
			System.out.println("printwriter_example.txt has been successfully created!");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		// FileOutputStream
		try(FileOutputStream w = new FileOutputStream("fileoutputstream.bin")){
			byte[] dataByte = {123, 123, 45, 32, 34, 34};
			w.write(dataByte);
			System.out.println("fileoutputstream.bin has been successfully created!"); 
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
