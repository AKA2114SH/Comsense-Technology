class First {
    int a, b; // Instance Variables

    // Parameterized Constructor
    First(int a, int b) {
        this.a = a; // 'this.a' refers to the instance variable
        this.b = b; // 'this.b' refers to the instance variable
    }

    // Method to calculate and display the sum
    void sum() {
        System.out.println("Sum of a + b = " + (a + b));
    }
}

class B {
    public static void main(String[] args) {
        First obj = new First(10, 20);
        obj.sum();
    }
}