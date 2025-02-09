public class Book {
    private String title;
    private String isbn;
    private Author author;

    public Book (String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;

        System.out.println("Book added to library: " + this.title);
    }

    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return isbn;
    }

    public Author author(){
        return author;
    }

    public void printInfo(){
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author.getName());
        System.out.println("Biography: " + author.getBiography());
    }
}