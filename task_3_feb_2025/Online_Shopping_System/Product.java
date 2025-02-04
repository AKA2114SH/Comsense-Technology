package task_3_feb_2025.Online_Shopping_System;

abstract class Product {
    String productName;
    double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public abstract double getDiscountedPrice();
}
