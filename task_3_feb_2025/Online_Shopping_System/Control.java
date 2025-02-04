package task_3_feb_2025.Online_Shopping_System;
public class Control {

    public static void main(String[] args) {
        Product phone = new Electronics("iPhone 15", 1000);
        Product tShirt = new Clothing("Summer Tee", 50);

        System.out.println("Phone price with discount: " + phone.getDiscountedPrice());
        System.out.println("T-shirt price with discount: " + tShirt.getDiscountedPrice());
    }
}