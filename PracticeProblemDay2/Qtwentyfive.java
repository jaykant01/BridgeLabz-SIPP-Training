package Day2;

import java.util.Scanner;

public class Qtwentyfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int far = sc.nextInt();
        int celsius = (far - 32) * 5/9;
        System.out.println(celsius);
    }
}
