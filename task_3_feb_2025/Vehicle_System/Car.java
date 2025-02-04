// Subclass Car
package task_3_feb_2025.Vehicle_System;
class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void accelerate() {
        speed += 20; 
        System.out.println(brand + " car accelerated by 20 km/h. New speed: " + speed + " km/h");
    }
}