package Exception.src.com.devided_by_zero;

public class DevidedByZero {

	public static void main(String[] args) {
	try{
		
		int a=100;
		int b=0;
		System.out.println(a/b);
	}catch(Exception e){
		System.out.println("Arith metic exception: Imposible to devide by 0");
	}

	}

}
