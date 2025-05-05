interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Triangle1 implements Shape {
    private double base, height;

    public Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapesArea {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);           // radius = 5
        shapes[1] = new Rectangle(4, 6);     // length = 4, width = 6
        shapes[2] = new Triangle1(3, 8);      // base = 3, height = 8

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Area of Shape " + (i + 1) + ": " + shapes[i].calculateArea());
        }
    }
}
