package task_4_feb_2025.Extending_an_interface;
public class Dog implements DomesticAnimal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public boolean isFriendly() {
        return true; 
    }
}