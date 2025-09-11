// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void findArea();
}

// Circle class
class Circle extends Shape {
    double radius = 5;

    void findArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length = 10;
    double width = 4;

    void findArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class
class Triangle extends Shape {
    double base = 8;
    double height = 5;

    void findArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Main class
public class AreaCalculator {
    public static void main(String[] args) {
        // Create objects of each shape
        Shape c = new Circle();
        Shape r = new Rectangle();
        Shape t = new Triangle();

        // Call findArea() for each
        c.findArea();
        r.findArea();
        t.findArea();
    }
}
