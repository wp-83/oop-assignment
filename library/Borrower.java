import java.util.ArrayList;

public class Borrower {
    private String nameBorrower;
    private ArrayList<Book> dataBorrower;

    public Borrower(String name) {
        this.nameBorrower = name;
        dataBorrower = new ArrayList<Book>();
    } 

    public void setDataBorrower(Book book){
        this.dataBorrower.add(book);
    }

    public void displayBorrowedBooks(){
        System.out.println(this.nameBorrower + "'s Borrowed Books: ");
        for (Book i : dataBorrower){
            i.printInfo();
            System.out.println("------------------------");
        }
    }

    public void removeDataBorrower(Book book){
        dataBorrower.remove(book);
    }

}
