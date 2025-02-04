import java.util.ArrayList;

// This class manages the library system
public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    // Remove a book by ISBN
    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
        System.out.println("Removed book with ISBN: " + ISBN);
    }

    // Register a new member
    public void registerMember(Member member) {
        members.add(member);
        System.out.println("New member added: " + member.getName());
    }

    // Find a book by ISBN
    public Book findBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}
