import java.util.Scanner;
import java.util.Arrays;

public class Matrix{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2. 3x3 matrix and transpose
        int[][] matrix = new int[3][3];
        System.out.println("\nEnter 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("\nTranspose of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
