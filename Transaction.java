import java.time.LocalDate;

// This class records transactions
public class Transaction {
    private int transactionID;
    private Member member;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    // Constructor
    public Transaction(int transactionID, Member member, Book book) {
        this.transactionID = transactionID;
        this.member = member;
        this.book = book;
        this.borrowDate = LocalDate.now();
        this.returnDate = borrowDate.plusWeeks(2);  // Default 2 weeks borrow time
    }

    // Display transaction details
    public String toString() {
        return "Transaction [ID: " + transactionID + ", Member: " + member.getName() +
               ", Book: " + book.getTitle() + ", Borrowed: " + borrowDate + ", Due: " + returnDate + "]";
    }
}
