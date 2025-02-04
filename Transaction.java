import java.time.LocalDate;
public class Transaction {
    private int transactionID;
    private Member member;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    public Transaction(int transactionID, Member member, Book book) {
        this.transactionID = transactionID;
        this.member = member;
        this.book = book;
        this.borrowDate = LocalDate.now();
        this.returnDate = borrowDate.plusWeeks(2);
    }
    public String toString() {
        return "Transaction [ID: " + transactionID + ", Member: " + member.getName() +
               ", Book: " + book.getTitle() + ", Borrowed: " + borrowDate + ", Due: " + returnDate + "]";
    }
}
