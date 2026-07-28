// Maintained by Member 1 - Execution Driver & Benchmarking Engine
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("     PHASE 2 BENCHMARK SUITE (1,000 DATASET SIZE)   ");
        System.out.println("====================================================\n");

        // 1. Generate Dataset (Member 2's DataLoader)
        List<Book> bookList = DataLoader.generateLargeDataset(1000);

        // 2. Build Hash Indexes (Member 4's HashSolutions)
        Map<String, Book> titleMap = HashSolutions.buildTitleMap(bookList);
        Map<String, Book> isbnMap = HashSolutions.buildIsbnMap(bookList);

        String targetTitle = "Book Title 995"; 
        String targetIsbn = "978-000000995";

        // --- Benchmark 1: Linear Search O(n) (Member 3) ---
        long startLinear = System.nanoTime();
        Book resLinear = SearchSolutions.searchWithList(bookList, targetTitle);
        long endLinear = System.nanoTime();

        // --- Benchmark 2: Binary Search O(log n) (Member 3) ---
        Collections.sort(bookList, Comparator.comparing(Book::getTitle));
        long startBinary = System.nanoTime();
        Book resBinary = SearchSolutions.binarySearchWithList(bookList, targetTitle);
        long endBinary = System.nanoTime();

        // --- Benchmark 3: HashMap Title Search O(1) (Member 4) ---
        long startHash = System.nanoTime();
        Book resHash = HashSolutions.searchWithHashMap(titleMap, targetTitle);
        long endHash = System.nanoTime();

        // --- Benchmark 4: HashMap ISBN Search O(1) (Member 4) ---
        long startIsbn = System.nanoTime();
        Book resIsbn = HashSolutions.searchByIsbn(isbnMap, targetIsbn);
        long endIsbn = System.nanoTime();

        // Summary Output
        System.out.println("Target Found: " + resHash);
        System.out.println("----------------------------------------------------");
        System.out.println("Algorithm                       Complexity  Execution Time");
        System.out.println("----------------------------------------------------");
        System.out.printf("Linear Search (ArrayList)       O(n)        %,d ns\n", (endLinear - startLinear));
        System.out.printf("Binary Search (Sorted List)     O(log n)    %,d ns\n", (endBinary - startBinary));
        System.out.printf("HashMap Lookup (Title)          O(1)        %,d ns\n", (endHash - startHash));
        System.out.printf("HashMap Lookup (ISBN)           O(1)        %,d ns\n", (endIsbn - startIsbn));
        System.out.println("====================================================");
    }
}