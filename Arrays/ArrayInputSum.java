import java.util.Scanner;

public class ArrayInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

        while (true) {
            double input = sc.nextDouble();

            if (input <= 0 || index == 10) {
                break;
            }

            numbers[index] = input;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display entered numbers
        System.out.print("Entered numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display total
        System.out.println("\nTotal sum: " + total);

        sc.close();
    }
}
