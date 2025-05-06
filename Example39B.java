class Shape39 {
    public void draw() {
        System.out.println("Drawing a shape...");
    }

    public void erase() {
        System.out.println("Erasing a shape...");
    }
}

class Circle39 extends Shape39 {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Triangle39 extends Shape39 {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Triangle");
    }
}

class Square39 extends Shape39 {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Square");
    }
}

public class Example39B {
    public static void main(String[] args) {
        Shape39[] shapes = { new Circle39(), new Triangle39(), new Square39() };

        for (Shape s : shapes) {
            s.draw();
            s.erase();
            System.out.println();
        }
    }
}
