import java.util.ArrayList;
public class Member {
    private int memberID;
    private String name;
    private String membershipType;
    private ArrayList<Book> borrowedBooks;
    public Member() {
        this.memberID = 0;
        this.name = "Unknown";
        this.membershipType = "Regular";
        this.borrowedBooks = new ArrayList<>();
    }
    public Member(int memberID, String name, String membershipType) {
        this.memberID = memberID;
        this.name = name;
        this.membershipType = membershipType;
        this.borrowedBooks = new ArrayList<>();
    }
    public int getMemberID() { return memberID; }
    public String getName() { return name; }
    public String getMembershipType() { return membershipType; }

    public void setMemberID(int memberID) { this.memberID = memberID; }
    public void setName(String name) { this.name = name; }
    public void setMembershipType(String membershipType) { this.membershipType = membershipType; }
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed " + book.getTitle());
    }
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + " returned " + book.getTitle());
    }
    public String toString() {
        return "Member [ID: " + memberID + ", Name: " + name + ", Membership Type: " + membershipType + "]";
    }
}
