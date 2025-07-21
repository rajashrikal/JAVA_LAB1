//Display multiplication table
import java.util.Scanner;
public class MulTable{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number for multiplication table: ");
        int number =input.nextInt();

        System.out.println("\nMultiplication Table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
