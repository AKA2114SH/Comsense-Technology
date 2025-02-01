package Array;
    import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : array) {
            if (num != target) {
                list.add(num);
            }
        }

        System.out.println("Array after removal: " + list);
    }
}
    
