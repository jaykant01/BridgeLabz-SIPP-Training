package Day2;

import java.util.Scanner;

public class Qtwentysix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();
        int fromToVia = sc.nextInt();
        int viaToFinalCity = sc.nextInt();
        int totalDistance = fromToVia + viaToFinalCity;
        int timeFromToVia = sc.nextInt();
        int timeViaToFinalCity = sc.nextInt();
        int totalTime = timeFromToVia + timeViaToFinalCity;


        System.out.println("The Total Distance travelled by "+ name + " from "+ fromCity + " to "+ toCity + " via "+ viaCity + " is "+ totalDistance + " km and the total time taken is "+ totalTime + " minutes" );
    }
}
