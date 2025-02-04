import java.util.Scanner;

public class LibraryDrive {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1234", "The Java Handbook", "Patrick Naughton", "Programming", 39.99);
        Book book2 = new Book("5678", "Clean Code", "Robert C. Martin", "Programming", 49.99);
        Book book3 = new Book("91011", "The Pragmatic Programmer", "Andrew Hunt", "Programming", 44.99);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        Member member1 = new Member(1, "Alice", "Regular");
        Member member2 = new Member(2, "Bob", "Premium");
        library.registerMember(member1);
        library.registerMember(member2);
        System.out.println("\n--- Borrowing Book ---");
        member1.borrowBook(book1);
        System.out.println("\n--- Returning Book ---");
        member1.returnBook(book1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Library Menu ---");
        System.out.println("1. Display all books");
        System.out.println("2. Find a book by ISBN");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("\nList of all books in the library:");
            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);
        } else if (choice == 2) {
            System.out.println("\nEnter the ISBN to search for a book:");
            String isbn = scanner.next();
            Book foundBook = library.findBook(isbn);
            if (foundBook != null) {
                System.out.println("Book found: " + foundBook);
            } else {
                System.out.println("Book not found!");
            }
        } else {
            System.out.println("Invalid choice!");
        }
        scanner.close();
        System.out.println("\n--- Program Finished ---");
    }
}
