package Constructors;

public class CarRental {
    public String customerName;
    public String carModel;
    public int rentalDays;
    double totalPrice;


    public CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        totalPrice = totalCost();

        }

        @Override
        public String toString(){
        return "customerName: " + customerName +
                ", carModel: " + carModel +
                ", rentalDays: " + rentalDays +
                ", totalPrice: " + totalPrice;

    }

    private double totalCost(){
         if(carModel.equals("RollsRoyce")){
             return rentalDays * 5000;
         }else{
             return rentalDays * 1000;
         }
    }

}

class Main1{
    public static void main(String[] args) {
        CarRental carRental = new CarRental("Jaykant","RollsRoyce",10);
        CarRental carRental1 = new CarRental("Sanyam","Mercedes",20);
        System.out.println(carRental);
        System.out.println(carRental1);
    }
}
