package Day2;

import java.util.Scanner;

public class Qfourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        int area = (b * h)/2;
        double ainc = area * 2.54;
        System.out.println("the Area of the triangle in sq in is "+ ainc + " and sq cm is " + area);

    }
}
