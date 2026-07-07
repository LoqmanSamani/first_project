import java.util.Random;
import java.util.Arrays;

public class nestedLoops{
	public static void main(String[] args){
		// nested loops in java
		// matrix multiplication with nested loops
		
		// creating matrices
		double[][] mat1 = new double[4][5];
		double[][] mat2 = new double[5][7];
		double[][] mat3 = new double[4][7];
		Random r = new Random();

		// initialize matrices
		for (int i = 0; i < mat1.length; i++){
			for (int j = 0; j < mat1[i].length; j++){
				mat1[i][j] = r.nextDouble(-1, 1);
			}
		}
		for (int i = 0; i < mat2.length; i++){
			for (int j = 0; j < mat2[i].length; j++){
				mat2[i][j] = r.nextDouble(-1, 1);
			}
		}
		for (int i = 0; i < mat3.length; i++){
			for (int j = 0; j < mat3[i].length; j++){
				mat3[i][j] = 0.0;
			}
		}

		// matrix multiplication with nested loop
		for (int i = 0; i < mat3.length; i++){
			for (int j = 0; j < mat3[i].length; j++){
				double sum = 0;
				for (int k = 0; k < mat1[1].length; k++){
					sum += mat1[i][k] * mat2[k][j];
				}
				mat3[i][j] = sum;
			}
		}
		
		System.out.println(Arrays.deepToString(mat3));
		
	}
}
