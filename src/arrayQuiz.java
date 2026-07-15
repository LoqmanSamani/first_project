import java.util.Scanner;
import java.util.Random;

public class arrayQuiz{
        public static void main(String[] args){
                // matrix quiz!
                Scanner sc =  new Scanner(System.in);
                Random r = new Random();
                int [] yourResponses = {0, 0, 0, 0, 0};
                int[] nums = {-1, -1, -1, -1, -1};

                for (int i = 0; i < nums.length; i++){
                        boolean isThere = true;
                        int idx = -1;
                        while(isThere){
                                idx = r.nextInt(0, 9);
                                boolean isTrue = false;
                                for (int j = 0; j < nums.length; j++){
                                        if (idx == nums[j]){
                                                isTrue = true;
                                                break;
                                        }
                                }
                                if (!isTrue){
                                        isThere = false;
                                }
                        }
                        nums[i] = idx;
                }

                System.out.println("--------------------------------------");
		System.out.println("-     Welcome To Array Quiz Game     -");
                System.out.println("-   Answer The Following Questions   -");
                System.out.println("--------------------------------------");

                for (int i = 0; i < nums.length; i++){
                        int yourChoice = -1;
                        System.out.printf("Q%d. %s%n", i + 1, questions(nums[i]));
                        int answerIdx = r.nextInt(1, 5);
                        for (int j = 1; j < 5; j++){
                                if (j == answerIdx){
                                        System.out.println("  " + j + ". " + answers(nums[i]));
                                }else{
                                        boolean isEqual = true;
                                        int qIdx = -1;
                                        while (isEqual){
                                                int randomIdx = r.nextInt(0, 9);
                                                if (randomIdx == nums[i]){
                                                        continue;
                                                }else{
                                                        isEqual = false;
                                                        qIdx = randomIdx;
                                                }
                                        }
                                        System.out.println("  " + j + ". " + answers(qIdx));
                                }
                        }
                        System.out.print("Which option is True: ");
                        yourChoice = sc.nextInt();
                        if (yourChoice == answerIdx){
                                yourResponses[i] = 1;
				System.out.println();
                                System.out.println("****** True ******");
				System.out.println();
                        }else{
				System.out.println();
                                System.out.println("****** False ******");
				System.out.println();
                        }
                }

                int sum = 0;
                for (int val: yourResponses){
                        sum += val;
                }

                System.out.println("---------------------------------------------------------");
                System.out.printf("  You answered %d questions correctly out of 5 questions!%n", sum);
                System.out.println("---------------------------------------------------------");

                sc.close();
        }

        public static String questions(int num){

                String[] qs = {
                        "What does CPU stand for?",
                        "1 byte = how many bits?",
                        "Is HTML a programming language?",
                        "What protocols uses port 80?",
                        "What is the base of hexadecimal?",
                        "Which data structure is FIFO?",
                        "What does RAM stand for?",
                        "What is 10 in binary?",
                        "What is a function inside a class called?"
                };

                return qs[num];
        }

        public static String answers(int num){

                String[] as =  {
                        "Central Processing Unit",
                        "8",
                        "No",
                        "HTTP",
                        "16",
                        "Queue",
                        "Random Access Memory",
                        "1010",
                        "Method"
                };

                return as[num];
        }
}
