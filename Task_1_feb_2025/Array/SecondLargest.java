package Array;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Arrays.sort(array);
        int secondLargest = array[array.length - 2];

        System.out.println("Second largest element: " + secondLargest);
    }
}