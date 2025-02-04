// Main class
package task_3_feb_2025.Vehicle_System;
public class VehicleSystem {
    public static void main(String[] args) {
       
        Vehicle car = new Car("Toyota", 60);
        Vehicle bike = new Bike("Honda", 40);

       
        car.showDetails();
        car.accelerate();

        bike.showDetails();
        bike.accelerate();
    }
}