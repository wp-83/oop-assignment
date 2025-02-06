import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookData;
    
    public Library(){
        bookData = new ArrayList<Book>();
    }

    public void addBook(Book book){
        bookData.add(book);
    }

}
