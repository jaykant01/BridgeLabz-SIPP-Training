package Constructors;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "guestName='" + guestName + '\'' +
                ", roomType='" + roomType + '\'' +
                ", nights=" + nights +
                '}';
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("Guest 1", "Room 1", 5);
        System.out.println(h1);
        HotelBooking h2 = new HotelBooking("Guest 2", "Room 2", 5);
        System.out.println(h2);
    }
}
