package Day2;

import java.util.Scanner;

public class Qthirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextInt();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("the distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}
