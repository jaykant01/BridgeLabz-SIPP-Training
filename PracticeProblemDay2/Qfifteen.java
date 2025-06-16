package Day2;


import java.util.Scanner;

public class Qfifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitP = sc.nextInt();
        int qnt = sc.nextInt();
        int TotalP = unitP * qnt;
        System.out.println("The total purchase price is INR "+ TotalP);
    }


}
