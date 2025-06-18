import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Step 2: Create arrays
        int[][] marks = new int[n][3]; // 0 - Physics, 1 - Chemistry, 2 - Maths
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // Step 3: Input marks and validate
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                marks[i][j] = sc.nextInt();

                if (marks[i][j] < 0) {
                    System.out.println("Invalid mark! Must be positive. Please re-enter.");
                    j--; // redo the current subject
                }
            }
        }

        // Step 4: Calculate percentages and grades
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        // Step 5: Display results
        System.out.println("\n--- Result Summary ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %c\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close();
    }
}
