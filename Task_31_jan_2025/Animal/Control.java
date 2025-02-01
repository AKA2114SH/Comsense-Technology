package Task_31_jan_2025.Animal;

public class Control {
    public static void main(String[] args) {
        AnimalFamily obj = null;

        obj = new AnimalFamily();
        obj.sound();

        obj = new Bird();
        obj.sound();

        obj = new Cat();
        obj.sound();
    }
}