package Day2;

public class Qeight {
    public static void main(String[] args) {
        double earthRadius = 6378;
        double pi = Math.PI;
        double volume = (4/3) * pi * (earthRadius * earthRadius * earthRadius);
        double miles = volume * 1.6;
        System.out.println("The volume of earth in cubic km is " + volume + " and cubic miles is "+ miles);
    }
}
