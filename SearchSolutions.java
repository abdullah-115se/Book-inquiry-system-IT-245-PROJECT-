//Sequential & Logarithmic List Algorithms
import java.util.ArrayList;
import java.util.List;

public class SearchSolutions {

    // O(n) Sequential Linear Search
    public static Book searchWithList(List<Book> bookList, String targetTitle) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    // O(log n) Binary Search (List must be sorted first)
    public static Book binarySearchWithList(List<Book> sortedList, String targetTitle) {
        int low = 0;
        int high = sortedList.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = sortedList.get(mid).getTitle().compareToIgnoreCase(targetTitle);

            if (comparison == 0) {
                return sortedList.get(mid);
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
