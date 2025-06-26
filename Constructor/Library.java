package Constructors;

public class Library {
    public String ISBN;
    protected String title;
    private String author;

    public Library(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;

    }

    public void displayLibraryDetails (){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    //subclass
    public static class EBook{
        private Library library;

        public EBook(Library library){
            this.library = library;
        }

        public void displayEBookDetails(){
            library.displayLibraryDetails();
        }
    }

    public static void main(String[] args) {
        Library library = new Library("ABC","Tom","Gosling");
        Library.EBook ebook = new Library.EBook(library);
        ebook.displayEBookDetails();
    }

}
