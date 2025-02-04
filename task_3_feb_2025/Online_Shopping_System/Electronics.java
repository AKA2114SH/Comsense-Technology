package task_3_feb_2025.Online_Shopping_System;
class Electronics extends Product {
    private static final double ELECTRONICS_DISCOUNT = 0.1; 

     Electronics(String productName, double price) {
        super(productName, price);
    }

    @Override
    public double getDiscountedPrice() {
        return price * (1 - ELECTRONICS_DISCOUNT);
    }
}