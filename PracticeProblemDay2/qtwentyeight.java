package Day2;

import java.util.Scanner;

public class qtwentyeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfChocolate = sc.nextInt();
        int noOfChildren = sc.nextInt();
        int remaning = noOfChocolate % noOfChildren;
        int eachChocolate = noOfChocolate / noOfChildren;
        System.out.println(remaning);
        System.out.println(eachChocolate);
    }
}
