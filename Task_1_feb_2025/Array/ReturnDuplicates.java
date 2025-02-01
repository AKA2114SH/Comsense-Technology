package Array;
import java.util.HashSet;

public class ReturnDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}