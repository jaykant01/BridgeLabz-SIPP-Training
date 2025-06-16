package Day2;

import java.util.Scanner;

public class HandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // numberOfStudents
        int combination = (n*(n-1))/2;
        System.out.println(combination);

    }
}
