package Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numArray = {5, 2, 9, 1, 5, 6};
        String[] strArray = {"apple", "orange", "banana", "grape"};

        Arrays.sort(numArray);
        Arrays.sort(strArray);

        System.out.println("Sorted Numerical Array: " + Arrays.toString(numArray));
        System.out.println("Sorted String Array: " + Arrays.toString(strArray));
    }
}