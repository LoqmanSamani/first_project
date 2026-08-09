import java.util.Scanner;

public class Threading{
	public static void main(String[] args){
		// threading: allow a program to run multiple tasks simultaneously
		// help improve performance with time consuming operations
		// (file I/O, network communications, or any background tasks)
		
		// how to create a thread
		// option 1: extend the thread class (simpler method)
		// option 2: implement the runnable interface (better)

		// option 1
		//myThread thread1 = new myThread();
                //thread1.start();

		// option 2
		myRunnable myrunnable = new myRunnable();
		Thread thread = new Thread(myrunnable);
		thread.setDaemon(true);
		thread.start();

		Scanner sc = new Scanner(System.in);
		System.out.println("You have 5 second to enter you name");
		System.out.println("-----------------------------------");
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.printf("Hello %s%n", name);
		sc.close();
		
	}
}
