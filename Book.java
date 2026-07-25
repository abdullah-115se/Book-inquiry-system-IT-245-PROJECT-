public class Book {
// Impplemented by Member 2 - Book Data Model Architecture
    private String title;
    private String author;
    private String isbn;

    // Constructor taking 3 String arguments
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter method needed by Main.java and SearchSolutions.java
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{Title='" + title + "', Author='" + author + "', ISBN='" + isbn + "'}";
    }
}
