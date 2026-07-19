public class Car{

        // car class, used to learn oop
        // this class is used by OOP.java

        String make = "Ford";
        String model = "Mustang";
        int year = 2025;
        double price = 58000.99;
        boolean isRunning = false;

        void start(){
                isRunning = true;
                System.out.println("You started the engine!");
                System.out.printf("Now isRunning is: %b %n", isRunning);
        }

        void stop(){
                isRunning = false;
                System.out.println("You stopped the engine!");
                System.out.printf("Now isRunning is: %b %n", isRunning);
        }
}
