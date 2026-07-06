public class breakContinue{
	public static void main(String[] args){
		// break & continue operations 
		// and their usages in loop operations
		// break: stoping and break out of the loop
		// continue: skip the current iteration of the loop 
		
		// example (break)
		for (int i = 0; i < 10; i++){
			if (i == 5){
				// comment out to execute
				System.out.println();
				break; 
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		// example (continue)
		for (int i = 0; i < 10; i++){
			if (i == 5){
				System.out.print(" *** ");
				continue;
			}
			System.out.print(i + " ");
			if (i == 9){
				System.out.println();
			}
		}
		
	}
}
