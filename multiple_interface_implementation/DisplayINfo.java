package multiple_interface_implementation;

public class DisplayINfo implements Pritable,Showable{
	@Override
	public void show() {
		System.out.println("From Showable..");
		
	}

	@Override
	public void print() {
	System.out.println("From Printable..");
		
	}
	public static void main(String[] args) {
	  DisplayINfo d=new DisplayINfo();
	  d.show();
	  d.print();

	}



}
