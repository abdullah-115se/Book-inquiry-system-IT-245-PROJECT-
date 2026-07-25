// Implemented by Member 3 - Linear Search and HashMap Lookup

import java.util.Map;

public class SearchSolutions {

    // Linear Search Implementation
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // HashMap Lookup Implementation
    public static Object hashMapLookup(Map<Object, Object> map, Object key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }
}
