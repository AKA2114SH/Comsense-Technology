package Array;
import java.util.HashSet;

public class CommonElementsString {
    public static void main(String[] args) {
        String[] array1 = {"apple", "orange", "banana"};
        String[] array2 = {"banana", "grape", "apple"};
        HashSet<String> set = new HashSet<>();
        HashSet<String> commonElements = new HashSet<>();

        for (String str : array1) {
            set.add(str);
        }

        for (String str : array2) {
            if (set.contains(str)) {
                commonElements.add(str);
            }
        }

        System.out.println("Common elements: " + commonElements);
    }
}