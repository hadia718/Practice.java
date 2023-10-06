package labassignment1;

public class Book extends LibraryItem{
    private int pagecount;

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    Book(String title, String author, int year){
    super(title,author,year);
    this.pagecount=pagecount;
    }
}
