package Array;
import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> commonElements = new HashSet<>();

        for (int num : array1) {
            set.add(num);
        }

        for (int num : array2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }

        System.out.println("Common elements: " + commonElements);
    }
}