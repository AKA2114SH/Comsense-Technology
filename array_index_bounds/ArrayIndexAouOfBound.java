package array_index_bounds;

public class ArrayIndexAouOfBound {
	public static void main(String[] m){
		try{
			int arr[]=new int[4];
			System.out.println(arr[5]);
		}catch(Exception e){
			System.out.println("Array index out of bound exception "+ e.getMessage());
		}
	}
}

