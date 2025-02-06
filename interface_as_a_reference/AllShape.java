package interface_as_a_reference;

public class AllShape {

	public static void main(String[] args) {
		
		Shape s=null;
		s=new Circle();
		s.calculateArea();
		
		s=new Rectangle();
		s.calculateArea();

	}

}
