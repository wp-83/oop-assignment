import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowList = new ArrayList<Book>();

    public Borrower(String name){
        this.name = name;
    }
 
    public String getName(){
        return name;
    }

    public void addBorrowBook(Book book){
        borrowList.add(book);
        System.out.println(name + " borrowed: " + book.getTitle());
    }

    public void removeBorrowBook(Book book){
        borrowList.remove(book);
    }

    public void displayBorrowedBooks(){
        System.out.println(name + "'s borrowed Books:");

        for (Book book : borrowList){
            book.printInfo();
            System.out.println("------------------------");
        }
    }
}