import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    // Automatically generates N fake books for benchmarking
    public static List<Book> generateLargeDataset(int count) {
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            books.add(new Book("Book Title " + i, "Author " + i, "978-000000" + i));
        }
        return books;
    }
}
