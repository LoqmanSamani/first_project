public class IfStatements{

	public static void main(String[] args){
		// if statements in java
		int[] ages = {-10, 10, 54, 28, 0, 18};
   		for (int age: ages){

			if(age >= 18){
				System.out.println("You are an adult!");
			}
			else if(age <= 0){
				System.out.println("It's not possible to have negative age!");
			}
			else{
				System.out.println("You are a child!");
	  		}
		}
	}
}
