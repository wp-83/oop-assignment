import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookData = new ArrayList<Book>();
    
    public void addBook(Book book){
        bookData.add(book);
    }
    
    public ArrayList<Book> borrowBook(String bookTitle){
        return this.bookData.contains(bookTitle);
    }

}
