public class Anonymous{
	public static void main(String[] args){
		// anonymous class: a class that does not have a name!
		// cannot be reused!
		// add custom behaviour without having to add a new class.
		// often used for one time uses (TimerTask, Runnable, callbacks)
		Dog1 dog1 = new Dog1();
		Dog1 dog2 = new Dog1(){
			@Override
			void speak(){
				System.out.println("Scooby Doo says *Ruh Ruh*");
			}
		};

		dog1.speak();
		dog2.speak();
	}
}
