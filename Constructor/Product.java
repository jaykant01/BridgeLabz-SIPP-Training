package Constructors;

public class Product {
    public String productName;
    public int price;

    // class Variable
    static int totalProducts = 0;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    @Override
    public String toString(){
        return "Product Name: " + productName +
                ", Price: " + price ;
    }


    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);

    }

}

class Main2{
    public static void main(String[] args) {
        Product p1 = new Product("Apple", 1000);
        System.out.println(p1);
        Product p2 = new Product("mango", 2000);
        System.out.println(p2);
        Product p3 = new Product("Grapes", 3000);
        System.out.println(p3);
        System.out.println();
        Product.displayTotalProducts();
    }
}
