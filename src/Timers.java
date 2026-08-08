import java.util.Timer;
import java.util.TimerTask;

public class Timers{
	public static void main(String[] args){
		// Timer: class that schedules tasks at specific time or periodically
		// useful for: sending notifications, scheduled updates, repetitive actions
		
		// TimerTask: represents the task which will be executed by Timer
		// you will extend TimerTask to represent your specific task
		// to do so create a subclass of TimerTask and @Override run()

		Timer timer = new Timer();
		TimerTask task = new TimerTask(){
			int count = 10;
			@Override
			public void run(){
				System.out.println("Hello!");
				count --;
				if (count <= 0){
					System.out.println("TASK COMPLETE!!!");
					timer.cancel();
				}
			}
		};
		// one time schedule
		//timer.schedule(task, 3000);//first arg is the task and the second is the delay in milisecond.
		
		// periodic task
		timer.schedule(task, 1000, 2000); // second arg is the first delay and the third is between task delay 
		
	}
}
