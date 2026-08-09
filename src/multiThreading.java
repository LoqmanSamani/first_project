public class multiThreading{
	public static void main(String[] args){
		// multi-threading: enables a program to run multi-threads concurrently
		// (thread: a set of instructions that run independently)
		// useful for background tasks or time consuming operations
		
		System.out.println("Game Start!");

		Thread thread1 = new Thread(new MyRunnable());
		Thread thread2 = new Thread(new MyRunnable());

		thread1.start();
		thread2.start();
		
		// wait for the main thread!
		try{
			thread1.join();
			thread2.join();
		}
		catch (InterruptedException e){
			System.out.println("Main thread was interrupted!");
		}
		System.out.println("Game Over!");
	}
}
