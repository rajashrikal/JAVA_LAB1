 // 1. Input 10 integers: average, max, min
import java.util.Scanner;
import java.util.Arrays;

public class Average{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input 10 integers: average, max, min
        int[] numbers = new int[10];
        int sum = 0, max, min;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        max = min = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }

        double average = (double) sum / 10;
        System.out.println("\nAverage: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}