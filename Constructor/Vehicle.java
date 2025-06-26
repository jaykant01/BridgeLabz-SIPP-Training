package Constructors;

public class Vehicle {
    public String ownerName;
    public String vehicleType;

    static double registrationFee = 1000;

    public Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Owner Name: " + ownerName +
                ", Vehicle Type: " + vehicleType;
    }

    public void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newRegistrationFee){
        registrationFee = newRegistrationFee;
    }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(5000);

        Vehicle vehicle = new Vehicle("John Doe", "Sedan");
        vehicle.displayVehicleDetails();
        Vehicle vehicle1 = new Vehicle("Jonny bravo", "SUV");
        vehicle1.displayVehicleDetails();

    }

}
