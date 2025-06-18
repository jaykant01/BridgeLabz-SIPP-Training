import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        // Count digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        // Extract digits
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display reverse
        System.out.print("Digits in reverse order: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        sc.close();
    }
}
