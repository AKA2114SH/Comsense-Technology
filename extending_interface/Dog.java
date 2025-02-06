package extending_interface;

public class Dog implements DomesticAnimal{

	@Override
	public void makeSound() {
		System.out.println("Barking");
		
	}

	@Override
	public void isFriendly() {
		System.out.println("Friendly");
		
	}
	
	public static void main(String[] k){
		Dog d=new Dog();
		d.makeSound();
		d.isFriendly();
	}

}
