import java.util.Scanner;

public class twoDArray{
	public static void main(String[] args){
		double[][] nums = {
				{1, 2, 3}, 
				{2, 3, 4}, 
				{5, 6, 8}
				};
		for (int i = 0; i < nums.length; i++){
			for (int j = 0; j < nums[0].length; j++){
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("-  let's create a matrix  -");
		System.out.println("---------------------------");
		int rows = 0;
		int cols =  0;
		System.out.print("How many rows the matrix should have: ");
		rows =  sc.nextInt();
		System.out.print("How many columns the matrix should have: ");
		cols =  sc.nextInt();
		createArray(rows, cols);
		sc.close();
	}
	public static void createArray(int rows, int cols){
		Scanner sc = new Scanner(System.in);
		double array[][] = new double[rows][cols];
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				System.out.printf("Add a double for (%d, %d): ", i, j);
				array[i][j] = sc.nextDouble();
			}
		}
		System.out.println("-------------------");
		System.out.println("Your created matrix");
		System.out.println("-------------------");
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
