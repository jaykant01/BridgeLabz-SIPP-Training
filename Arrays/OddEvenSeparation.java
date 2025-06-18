import java.util.Scanner;

public class OddEvenSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return;
        }

        int[] evenArray = new int[number / 2 + 1];
        int[] oddArray = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;

        // Separate even and odd numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenArray[evenIndex++] = i;
            } else {
                oddArray[oddIndex++] = i;
            }
        }

        // Display even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }

        // Display odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
        }

        sc.close();
    }
}
