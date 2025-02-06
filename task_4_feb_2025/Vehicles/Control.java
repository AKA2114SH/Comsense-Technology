package task_4_feb_2025.Vehicles;

public class Control {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        car.fuel();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
        bike.fuel();
    }
}
