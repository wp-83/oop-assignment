import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookData;
    
    public Library(){
        bookData = new ArrayList<Book>();
    }

    public void addBook(Book book){
        bookData.add(book);
    }

    public void borrowBook(Borrower borrower, Book book){
        borrower.setDataBorrower(book);
        bookData.remove(book);
    }

    public void returnBook(Borrower borrower, Book book){
        bookData.add(book);
        borrower.removeDataBorrower(book);
    }

    public void displayLibraryBooks(){
        System.out.println("Books in library: ");
        for (Book i : bookData){
            i.printInfo();
            System.out.println("------------------------");
        }
    }   
}
