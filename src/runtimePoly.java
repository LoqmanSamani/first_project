import java.util.Scanner;

public class runtimePoly{
	public static void main(String[] args){
		// runtime polymorphism: when the method that gets executed
		// it decided at runtime based on the actual type of the object
		// it's also know as dynamic polymorphism

		String animalType;
		boolean isInstantiated = false;
		ANIMAL animal;
		Scanner sc = new Scanner(System.in);

		do{
			System.out.print("Which type of animal you want (cat or dog): ");
			animalType = sc.nextLine().toLowerCase();

			if (animalType.equals("cat") || animalType.equals("dog")){
				isInstantiated = true;
			}else{
				System.out.println("choose a valid type of animal!");
			}	System.out.println("only dog and cat are allowed!");
		}while(!isInstantiated);

		if (animalType.equals("cat")){
			animal = new CAT();
		}else{
			animal = new DOG();
		}
		animal.speak();
		sc.close();

	}
}
