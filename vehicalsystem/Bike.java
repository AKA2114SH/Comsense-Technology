package vehicalsystem;

public class Bike extends Vehical{

	
	void accelarate() {
		speed=10;
		brand="Shine";
		

	}


	public static void main(String[] args) {
		Bike b=new Bike();
		b.accelarate();
		b.showDetails();

	}

}
