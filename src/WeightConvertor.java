import java.util.Scanner;

public class WeightConvertor{
	public static void main(String[] args){
		// convert weight from kg to lbs and vise versa.

		// initialize scanner
		Scanner sc = new Scanner(System.in);
		
		// variables
		double inputWeight = 0;
		double finalWeight = 0;
		String inputUnit;
		String convertTo;

		// inputs
		System.out.print("Enter final unit (kg or lbs): ");
		convertTo = sc.nextLine().toLowerCase();
		System.out.print("Enter weight: ");
		inputWeight = sc.nextInt();
		
		// convert
		if (convertTo.equals("kg")){
			finalWeight = inputWeight / 2.20462;
		}
		else if(convertTo.equals("lbs")){
			finalWeight = inputWeight * 2.20462;
		}
		else{
			System.out.println("Invalid weight unit! this application only supports kg and lbs.");
		}
		
		// output
		System.out.printf("Your input weight in %s is %f%n", convertTo, finalWeight);
		
	}
}
