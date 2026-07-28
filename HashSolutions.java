import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashSolutions {

    // Builds Title-indexed HashMap
    public static Map<String, Book> buildTitleMap(List<Book> books) {
        Map<String, Book> titleMap = new HashMap<>();
        for (Book book : books) {
            titleMap.put(book.getTitle().toLowerCase().trim(), book);
        }
        return titleMap;
    }

    // Builds ISBN-indexed HashMap
    public static Map<String, Book> buildIsbnMap(List<Book> books) {
        Map<String, Book> isbnMap = new HashMap<>();
        for (Book book : books) {
            String cleanIsbn = book.getIsbn().replace("-", "").trim();
            isbnMap.put(cleanIsbn, book);
        }
        return isbnMap;
    }

    // O(1) Title Lookup
    public static Book searchWithHashMap(Map<String, Book> bookMap, String targetTitle) {
        if (targetTitle == null) return null;
        return bookMap.get(targetTitle.toLowerCase().trim());
    }

    // O(1) ISBN Lookup
    public static Book searchByIsbn(Map<String, Book> isbnMap, String rawIsbn) {
        if (rawIsbn == null) return null;
        String cleanIsbn = rawIsbn.replace("-", "").trim();
        return isbnMap.get(cleanIsbn);
    }
}