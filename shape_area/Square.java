package shape_area;
class Square extends Shape {
    double side;


    Square(double side) {
        this.side = side;
    }

  
    @Override
    void calculateArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}
