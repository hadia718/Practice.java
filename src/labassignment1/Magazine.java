package labassignment1;

public class Magazine extends LibraryItem{
    private int issueNumber;

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    Magazine(String title, String author, int year){
    super(title, author, year);
    this.issueNumber=issueNumber;
    }
}
