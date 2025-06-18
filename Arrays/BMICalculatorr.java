import java.util.*;
public class BMICalculatorr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];

        // Step 2: Take input weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter data for Person " + (i + 1));

            // Weight
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.print("Invalid weight! Enter a positive value: ");
                weight = sc.nextDouble();
            }

            // Height
            System.out.print("Enter height in meters: ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.print("Invalid height! Enter a positive value: ");
                height = sc.nextDouble();
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            // Step 3: Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Step 4: Determine status
            if (bmi <= 18.4)
                weightStatus[i] = "Underweight";
            else if (bmi <= 24.9)
                weightStatus[i] = "Normal";
            else if (bmi <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Step 5: Display the results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f m, BMI = %.2f, Status = %s\n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }

}
