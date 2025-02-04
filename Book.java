// This class represents a book in the library
public class Book {
    private String ISBN;
    private String title;
    private String author;
    private String category;
    private double price;

    // Constructor to set default values
    public Book() {
        this.ISBN = "0000";
        this.title = "Unknown";
        this.author = "Unknown";
        this.category = "Uncategorized";
        this.price = 0.0;
    }

    // Constructor with parameters (used to create real books)
    public Book(String ISBN, String title, String author, String category, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    // Getter methods (used to access private variables)
    public String getISBN() { return ISBN; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    // Setter methods (used to change private variables)
    public void setISBN(String ISBN) { this.ISBN = ISBN; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setCategory(String category) { this.category = category; }
    public void setPrice(double price) { this.price = price; }

    // toString method (used to display book details)
    public String toString() {
        return "Book [ISBN: " + ISBN + ", Title: " + title + ", Author: " + author +
               ", Category: " + category + ", Price: $" + price + "]";
    }
}
