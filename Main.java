import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Data Structures
        List<Book> bookList = new ArrayList<>();
        Map<String, Book> bookMap = new HashMap<>();

        // Phase 1 Sample Data
        Book b1 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");
        Book b2 = new Book("Java Concurrency in Practice", "Brian Goetz", "978-0321349606");
        Book b3 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");

        // Populate both collections
        addBook(b1, bookList, bookMap);
        addBook(b2, bookList, bookMap);
        addBook(b3, bookList, bookMap);

        String targetTitle = "Effective Java";

        // --- Testing Solution 1: ArrayList (Linear Search - O(n)) ---
        System.out.println("=== Phase 1 Test: ArrayList Search (O(n)) ===");
        long startTime1 = System.nanoTime();
        Book result1 = SearchSolutions.searchWithList(bookList, targetTitle);
        long endTime1 = System.nanoTime();
        System.out.println("Result: " + result1);
        System.out.println("Execution Time: " + (endTime1 - startTime1) + " ns\n");

        // --- Testing Solution 2: HashMap (Direct Lookup - O(1)) ---
        System.out.println("=== Phase 1 Test: HashMap Search (O(1)) ===");
        long startTime2 = System.nanoTime();
        Book result2 = SearchSolutions.searchWithHashMap(bookMap, targetTitle);
        long endTime2 = System.nanoTime();
        System.out.println("Result: " + result2);
        System.out.println("Execution Time: " + (endTime2 - startTime2) + " ns");
    }

    // Helper method to add book to both list and map
    private static void addBook(Book book, List<Book> list, Map<String, Book> map) {
        list.add(book);
        map.put(book.getTitle().toLowerCase(), book);
    }
}