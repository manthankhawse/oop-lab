import java.util.ArrayList;
import java.util.List;

class InvalidCouponException extends Exception {
    public InvalidCouponException(String message) {
        super(message);
    }
}

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class NegativeQuantityException extends Exception {
    public NegativeQuantityException(String message) {
        super(message);
    }
}

class Item {
    String name;
    double price;
    int stock;

    public Item(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}


class ShoppingCart {
    private List<Item> cartItems;
    private double totalAmount;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
        totalAmount = 0.0;
    }

    public void addItem(Item item, int quantity) throws OutOfStockException, NegativeQuantityException {
        if (quantity <= 0) {
            throw new NegativeQuantityException("Quantity cannot be zero or negative.");
        }
        if (quantity > item.stock) {
            throw new OutOfStockException("Item " + item.name + " is out of stock.");
        }
        cartItems.add(item);
        totalAmount += item.price * quantity;
        item.stock -= quantity;
    }

    public void applyCoupon(String couponCode) throws InvalidCouponException {
        if (couponCode.equals("DISCOUNT10")) {
            totalAmount *= 0.9;
            System.out.println("Coupon applied successfully! 10% discount applied.");
        } else if (couponCode.equals("DISCOUNT20")) {
            totalAmount *= 0.8;
            System.out.println("Coupon applied successfully! 20% discount applied.");
        } else {
            throw new InvalidCouponException("Invalid coupon code.");
        }
    }

    public void checkout() {
        System.out.println("Checkout complete. Total amount: $" + totalAmount);
    }

    public void displayCart() {
        System.out.println("Items in your cart:");
        for (Item item : cartItems) {
            System.out.println("Item: " + item.name + ", Price: $" + item.price);
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {

        Item item1 = new Item("Laptop", 1000.0, 5);
        Item item2 = new Item("Smartphone", 500.0, 3);
        Item item3 = new Item("Headphones", 100.0, 10);


        ShoppingCart cart = new ShoppingCart();

        try {
            cart.addItem(item1, 2);  // Add 2 Laptops
            cart.addItem(item2, 1);  // Add 1 Smartphone
            cart.addItem(item3, 3);  // Add 3 Headphones

            cart.displayCart();

            cart.applyCoupon("DISCOUNT10");

            cart.checkout();

        } catch (OutOfStockException | NegativeQuantityException | InvalidCouponException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
