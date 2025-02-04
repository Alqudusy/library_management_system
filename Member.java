import java.util.ArrayList;

// This class represents a library member
public class Member {
    private int memberID;
    private String name;
    private String membershipType;
    private ArrayList<Book> borrowedBooks;  // A list to store borrowed books

    // Default constructor
    public Member() {
        this.memberID = 0;
        this.name = "Unknown";
        this.membershipType = "Regular";
        this.borrowedBooks = new ArrayList<>();
    }

    // Constructor with parameters
    public Member(int memberID, String name, String membershipType) {
        this.memberID = memberID;
        this.name = name;
        this.membershipType = membershipType;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and Setters
    public int getMemberID() { return memberID; }
    public String getName() { return name; }
    public String getMembershipType() { return membershipType; }

    public void setMemberID(int memberID) { this.memberID = memberID; }
    public void setName(String name) { this.name = name; }
    public void setMembershipType(String membershipType) { this.membershipType = membershipType; }

    // Method to borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed " + book.getTitle());
    }

    // Method to return a book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + " returned " + book.getTitle());
    }

    // Display member details
    public String toString() {
        return "Member [ID: " + memberID + ", Name: " + name + ", Membership Type: " + membershipType + "]";
    }
}
