package Constructors;

class Book {
    // Instance Variable
   public String title;
   public String author;
   public double price;
   public boolean availability;

   // Parameterized Constructor
    public Book(String author, String title, double price, boolean availability) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.availability = availability;
    }

    // Non Parameterized Constructor
    public Book(){
        author = "JK Rowling";
        title = "Harry Potter";
        price = 50;
        availability = false;
    }

    // Copy Constructor
    Book(Book harsh){
        this.author = harsh.author;
        this.title = harsh.title;
        this.price = harsh.price;
        this.availability = harsh.availability;
    }

    @Override
    public String toString(){
        return "Title: " + title +
                "\nAuthor: " + author +
                "\nPrice " + price +
                "\nAvailability" + availability;

    }

    public void borrowBook(){
        if(availability){
            availability = false;
            System.out.println("Book is available \"" + title + "\".");
        }else{
            System.out.println("Sorry, \"" + title + "\"  Book is not available");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Book book1 = new Book("James Gosling", "Java Programming", 15.0, true);
        System.out.println(book1);

        Book book2 = new Book();
        System.out.println(book2);

        Book book3 = new Book(book1);
        System.out.println(book3);
    }
}
