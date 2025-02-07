public class Book {
    private String title;
    private String isbn;
    private Author author;

    public Book (String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;

        printTitle();
    }

    public void printTitle(){
        System.out.println("Alice borrowed: " + this.title);
    }

    public void printInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Author: " + this.author.getName());
        System.out.println("Biography: " + this.author.getbiography());
    }

    public void printAdd(){
        System.out.println("Book added to library: " + this.title);
    }
}
