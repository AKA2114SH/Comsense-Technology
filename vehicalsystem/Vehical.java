package vehicalsystem;

abstract public class Vehical {
	String brand;
	double speed;
	
	abstract void accelarate();
	
	void showDetails(){
		System.out.println("Car name: "+brand);
		System.out.println("Car speed: "+ speed+" km/h");
		
	}
}
