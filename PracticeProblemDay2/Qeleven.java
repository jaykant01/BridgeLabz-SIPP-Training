package Day2;
import java.util.*;
public class Qeleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double op1= a + b * c;
        double op2 = a * b + c;
        double op3 = c + a/b;
        double op4 = a % b + c;

        System.out.println("op1 is " + op1);
        System.out.println("op2 is " +  op2);
        System.out.println("op3 is " + op3);
        System.out.println("op4 is " + op4);

    }
}
