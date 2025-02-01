package Array;
import java.util.HashSet;

public class FindDuplicatesString {
    public static void main(String[] args) {
        String[] array = {"apple", "orange", "banana", "apple", "grape"};
        HashSet<String> set = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String str : array) {
            if (!set.add(str)) {
                duplicates.add(str);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}