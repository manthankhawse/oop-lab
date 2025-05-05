abstract class Shape1 {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape1 {
    private double sideA, sideB, sideC;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    @Override
    double calculateArea() {
        double s = (sideA + sideB + sideC) / 2; // semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Heron's formula
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class AreaPeri {
    public static void main(String[] args) {
        Shape1 circle = new Circle1(5); // radius = 5
        Shape1 triangle = new Triangle(3, 4, 5); // sides = 3, 4, 5

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
