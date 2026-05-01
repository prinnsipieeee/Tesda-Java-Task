// 1. Interface called Shape
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// 2. Abstract class that implements Shape
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    // Constructor to initialize attributes
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Default implementations (usually for rectangles)
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// 3. Concrete class Circle
class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        // Ang circle ay walang length at width, kaya 0 ang pinapasa natin sa parent
        super(color, 0, 0);
        this.radius = radius;
    }

    // I-override natin ang formulas para sa Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// 3. Concrete class Rectangle
class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
    // Gagamitin na nito yung default methods galing sa AbstractShape
}

// 4. Main Class
public class Task15 {
    public static void main(String[] args) {
        // Create instances
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 10.0, 4.0);

        // Display results
        System.out.println("--- Circle Details ---");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\n--- Rectangle Details ---");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}