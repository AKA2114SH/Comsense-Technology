package Array;
public class FindIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}