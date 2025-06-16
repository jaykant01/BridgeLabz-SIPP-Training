package Day2;

import java.util.Scanner;

public class Qsixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        System.out.println("The add " + add);
        System.out.println("the sub "+ sub);
        System.out.println("the mil "+ mul);
        System.out.println("the div "+ div);
    }
}
