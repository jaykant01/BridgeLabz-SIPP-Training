import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number for multiplication table: ");
        int number = sc.nextInt();

        int[] table = new int[10];

        // Generate table
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Display table
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        sc.close();
    }
}
