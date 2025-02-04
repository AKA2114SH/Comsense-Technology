// Abstract class Vehicle
package task_3_feb_2025.Vehicle_System;
abstract class Vehicle {
    // Attributes
    String brand;
    int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Abstract method
    abstract void accelerate();

    // Non-abstract method
    void showDetails() {
        System.out.println("Brand: " + brand + ", Current Speed: " + speed + " km/h");
    }
}