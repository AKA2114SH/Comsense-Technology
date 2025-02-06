package hierarchical_interface;

public class CollegeStudent implements Student{
	@Override
	public void walk() {
		System.out.println("Student walk");
		
	}

	@Override
	public void study() {
		System.out.println("Student study in baap");
		
	}
	public static void main(String[] args) {
		CollegeStudent c=new CollegeStudent();
		c.walk();
		c.study();

	}

	

}
