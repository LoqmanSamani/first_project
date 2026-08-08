import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDown {
    public static void main(String[] args) {

        // count down program

        int count = 0;
        String beginTxt = "";
        String endTxt = "";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" -----------------------------------");
            System.out.println("|   Welcome to CountDown Program    |");
            System.out.println(" -----------------------------------");
            
            System.out.print("| Enter number of count down: ");
            count = sc.nextInt();
            sc.nextLine(); 

            System.out.print("| Enter the start message: ");
            beginTxt = sc.nextLine();

            System.out.print("| Enter the end message: ");
            endTxt = sc.nextLine();
            
        } catch (InputMismatchException e) {
            System.out.println("Enter an integer!");
            return; 
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            return;
        }

        final int startCount = count;
	final String stMessage = beginTxt;
	final String edMessage = endTxt;

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = startCount;

            @Override
            public void run() {
                if (countdown == startCount) {
                    System.out.println("   *** " + stMessage + " ***   ");
                }

                System.out.println("|     " + countdown);
                countdown--;

                if (countdown < 0) {
                    System.out.println("   *** " + edMessage + " ***   ");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
