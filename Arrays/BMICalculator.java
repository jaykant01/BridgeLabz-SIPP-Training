import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of people
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n]; // in meters
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input height & weight and calculate BMI
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weights[i] = sc.nextDouble();

            System.out.print("Enter height (m): ");
            heights[i] = sc.nextDouble();

            bmi[i] = weights[i] / (heights[i] * heights[i]);

            // Determine status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nBMI Report:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d - Height: %.2fm, Weight: %.2fkg, BMI: %.2f, Status: %s\n",
                    (i + 1), heights[i], weights[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
