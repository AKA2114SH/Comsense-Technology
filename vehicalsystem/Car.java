package vehicalsystem;

public class Car extends Vehical{
	
	void accelarate() {
		speed=20;
		brand="Mahindra Thar";
	}
	public static void main(String[] args) {
		Car c1=new Car();
		c1.accelarate();
		c1.showDetails();

	}

	

}
