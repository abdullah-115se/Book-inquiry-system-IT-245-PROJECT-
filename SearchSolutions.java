import java.util.List;
import java.util.Map;

public class SearchSolutions {

    // Solution 1: Linear Search using ArrayList - O(n)
    public static Book searchWithList(List<Book> bookList, String targetTitle) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    // Solution 2: Direct Lookup using HashMap - O(1)
    public static Book searchWithHashMap(Map<String, Book> bookMap, String targetTitle) {
        return bookMap.get(targetTitle.toLowerCase());
    }
}