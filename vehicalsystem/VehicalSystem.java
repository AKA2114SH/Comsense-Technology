package vehicalsystem;

public class VehicalSystem {

	public static void main(String[] args) {
		Vehical v=null;
		v=new Car();
		System.out.println("------car------");
		v.accelarate();
		v.showDetails();
		
		System.out.println("-------Bike-----");
		v=new Bike();
		v.accelarate();
		v.showDetails();
	}
}
