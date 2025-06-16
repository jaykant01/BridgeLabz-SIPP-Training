package Day2;

import java.util.Scanner;

public class Qtwenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int dist = 5000;
        int peri = s1 + s2 + s3;
        int totalRounds = dist/peri;
        System.out.println(totalRounds);
    }
}
