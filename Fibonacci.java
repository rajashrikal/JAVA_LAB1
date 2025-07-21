//Print Fibonacci series up to N terms
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 2. Fibonacci Series up to N terms (while loop)
        System.out.print("\nEnter number of terms for Fibonacci series: ");
        int n = input.nextInt();

        int a = 0, b = 1, count = 0;
        System.out.println("\nFibonacci Series up to " + n + " terms:");
        while (count < n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
        System.out.println(); // for new line

        
        input.close();
    }
}
