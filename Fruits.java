
// Base class Fruit
class Fruit {
    // Attributes of the fruit
    String name;
    String taste;
    String size;

    // Constructor for the base class
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to print the name and taste of the fruit
    public void eat() {
        System.out.println("Eating " + name + ": It tastes " + taste);
    }
}

// Subclass Apple
class Apple extends Fruit {

    // Constructor for Apple class
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Overriding the eat method for Apple
    @Override
    public void eat() {
        System.out.println("Eating " + name + ": It tastes " + taste + " and is crunchy!");
    }
}

// Subclass Orange
class Orange extends Fruit {

    // Constructor for Orange class
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Overriding the eat method for Orange
    @Override
    public void eat() {
        System.out.println("Eating " + name + ": It tastes " + taste + " and is juicy!");
    }
}

public class Fruits {
    public static void main(String[] args) {
        // Creating an object of Apple
        Fruit apple = new Apple("Apple", "sweet", "medium");
        apple.eat(); // Calls the overridden eat method in Apple class

        // Creating an object of Orange
        Fruit orange = new Orange("Orange", "sour", "medium");
        orange.eat(); // Calls the overridden eat method in Orange class
    }
}
