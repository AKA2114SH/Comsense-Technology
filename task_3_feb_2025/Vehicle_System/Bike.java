// Subclass Bike
package task_3_feb_2025.Vehicle_System;
class Bike extends Vehicle {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void accelerate() {
        speed += 10; 
        System.out.println(brand + " Bike accelerated by 10 km/h. New speed: " + speed + " km/h");
    }
}