class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: ₱" + price;
    }
}

public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("Noli Me Tangere", "Jose Rizal", 1887, 350.00);
        Book book2 = new Book("El Filibusterismo", "Jose Rizal", 1891, 400.00);
        Book book3 = new Book("Dekada '70", "Lualhati Bautista", 1983, 299.50);

        System.out.println("Book 1:");
        System.out.println(book1.toString());
        System.out.println();

        System.out.println("Book 2:");
        System.out.println(book2.toString());
        System.out.println();

        System.out.println("Book 3:");
        System.out.println(book3.toString());
    }
}

