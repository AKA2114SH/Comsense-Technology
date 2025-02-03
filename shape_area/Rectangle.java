package shape_area;
class Rectangle extends Shape {
    double length, width;

    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
