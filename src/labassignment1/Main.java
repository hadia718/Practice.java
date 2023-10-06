package labassignment1;

public class Main {
    public static void main(String[] args) {
        Library lab1=new Library();
        LibraryItem[] LibraryItem = new LibraryItem[100];
        Book book1 = new Book("MokeSmoth","MohsinHamid",2000);
        Book book2 = new Book("TheReluctant","MohsinHamid",2000);
        Magazine magazine1=new Magazine("DastanePakistan","HistoryDept",2022);
        LibraryItem[0]=book1;
        LibraryItem[1]=book1;
        System.out.println("available items are:");
        lab1.displayItems();
//        if(book1.getauthor().equals(book2.getauthor())){
//            System.out.println("these two are equal");
//        }else{
//            System.out.println("these books are not from same author");
//        }
    }
    }

