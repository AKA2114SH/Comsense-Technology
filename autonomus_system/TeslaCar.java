package autonomus_system;
public class TeslaCar extends Vehicale implements SelfDrive,ElecricVehicle{

	@Override
	public void chargeBattery() {
		System.out.println("Battery charged successfully...");	
	}

	@Override
	public void navigate() {
		System.out.println("Navigated successfully....");
		
	}
	public static void main(String[] args) {
		TeslaCar t= new TeslaCar();
		t.chargeBattery();
		t.navigate();

	}


}
