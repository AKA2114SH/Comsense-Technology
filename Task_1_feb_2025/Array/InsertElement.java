package Array;
import java.util.ArrayList;

public class InsertElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = 10;
        int position = 2;
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : array) {
            list.add(num);
        }

        list.add(position, element);

        System.out.println("Array after insertion: " + list);
    }
}