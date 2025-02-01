package Array;
public class SearchArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = false;

        for (int num : array) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}