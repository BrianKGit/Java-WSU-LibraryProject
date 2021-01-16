
/**
 * @author Brian Klein
 */
public class LibraryCard {

    private Student cardOwner; //aggregation
    private Date issueDate; //aggregation
    private int bookCount;

    public LibraryCard() {
    }

    public LibraryCard(Student cardOwner, Date issueDate, int bookCount) {
        this.cardOwner = cardOwner;
        this.issueDate = issueDate;
        this.bookCount = bookCount;
    }

    public Student getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(Student cardOwner) {
        this.cardOwner = cardOwner;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
    
    //check out method
    public void checkOut(int number) {
        if(number >0){
            bookCount += number;
        }
    }
    
    //check in method
    public void checkIn(int number) {
        if(number > 0 && number <= bookCount) {
            bookCount -= number;
        }
    }

    @Override
    public String toString() {
        return "Card Owner: " + cardOwner
                + "\nIssue Date: " + issueDate
                + "\nBook Count: " + bookCount;
    }

}
