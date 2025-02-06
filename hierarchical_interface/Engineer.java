package hierarchical_interface;

public class Engineer implements Employee{
	@Override
	 public void walk() {
		System.out.println("Engineer walks");
		
	}

	@Override
	public void work() {
		System.out.println("Working on java.");
		
	}

	public static void main(String[] args) {
	Engineer e=new Engineer();
	e.walk();
	e.work();

	}


	

}
