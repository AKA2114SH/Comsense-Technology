package task_3_feb_2025.Online_Shopping_System;
class Clothing extends Product {
    private static final double CLOTHING_DISCOUNT = 0.2; 

     Clothing(String productName, double price) {
        super(productName, price);
    }

    @Override
    public double getDiscountedPrice() {
        return price * (1 - CLOTHING_DISCOUNT);
    }
}