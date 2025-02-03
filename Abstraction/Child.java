package Abstraction;

public class Child extends Parent {  

    @Override
    void education() {
        System.out.println("The Baap Company");
    }

    @Override
    void job() {
        System.out.println("Placed in Microsoft");
    }

    void business() { 
        System.out.println("My business");
    }
}
