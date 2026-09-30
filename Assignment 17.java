abstract class Shape {

    // Abstract method
    abstract void area();
}

// First subclass
class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

// Second subclass
class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}
