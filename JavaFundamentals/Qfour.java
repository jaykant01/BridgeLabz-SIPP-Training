import java.util.*;
public class Qfour {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       double height = sc.nextDouble();
       double perInch = 2.54;
       double perFoot = 12;
       double inches = height / perInch;
       double feet = inches / perFoot;
       System.out.println("your height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
    }
}
