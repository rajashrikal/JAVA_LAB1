// // 3. Bubble Sort + Binary Search
import java.util.Scanner;
import java.util.Arrays;

public class SearchImplementation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        // 3. Bubble Sort + Binary Search
        int[] arr = new int[10];
        System.out.println("\nEnter 10 integers to sort and search:");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));

        // Binary Search
        System.out.print("\nEnter number to search: ");
        int key = input.nextInt();

        int left = 0, right = arr.length - 1;
        boolean found = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                System.out.println("Number found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }

        input.close();
    }
}
