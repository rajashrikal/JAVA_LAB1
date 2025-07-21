import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 3. Armstrong Number Check (do-while loop)
        System.out.print("\nEnter a number to check if it's an Armstrong number: ");
        int armstrongCheck = input.nextInt();

        int original = armstrongCheck;
        int sum = 0;
        int temp = armstrongCheck;

        do {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        } while (temp != 0);

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        input.close();
    }
}
