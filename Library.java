import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }
    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
        System.out.println("Removed book with ISBN: " + ISBN);
    }
    public void registerMember(Member member) {
        members.add(member);
        System.out.println("New member added: " + member.getName());
    }
    public Book findBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}
