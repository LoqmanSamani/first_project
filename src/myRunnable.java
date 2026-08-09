public class myRunnable implements Runnable{

	@Override
	public void run(){
		for (int i = 0; i <= 5; i++){
			try{
				Thread.sleep(1000);
			}
			catch (InterruptedException e){
				System.out.println("Thread was interrupted!");
			}
			if (i == 5){
				System.out.println();
				System.out.println("Time's up!");
				System.exit(0);
			}
		}
	}
}
