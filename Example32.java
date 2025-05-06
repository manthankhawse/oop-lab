// Abstract class Payment
abstract class Payment {
    private double amount;
    private String transactionID;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public abstract void processPayment();

    public void showTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: ₹" + amount);
    }
}

// CreditCardPayment subclass
class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String transactionID, double amount, String cardNumber, String cvv, String expiryDate) {
        setTransactionID(transactionID);
        setAmount(amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Card Number: " + cardNumber);
        showTransactionDetails();
        System.out.println("Credit Card Payment Successful.\n");
    }
}

// PayPalPayment subclass
class PayPalPayment extends Payment {
    private String email;
    private String password;

    public PayPalPayment(String transactionID, double amount, String email, String password) {
        setTransactionID(transactionID);
        setAmount(amount);
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment...");
        System.out.println("PayPal Email: " + email);
        showTransactionDetails();
        System.out.println("PayPal Payment Successful.\n");
    }
}

// UPIPayment subclass
class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String transactionID, double amount, String upiId) {
        setTransactionID(transactionID);
        setAmount(amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: " + upiId);
        showTransactionDetails();
        System.out.println("UPI Payment Successful.\n");
    }
}

// PaymentGateway to process all payments
class PaymentGateway {
    public void process(Payment payment) {
        payment.processPayment();
    }
}

// Main class
public class Example32 {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();

        Payment credit = new CreditCardPayment("TXN1001", 5000, "1234-5678-9012-3456", "123", "12/26");
        Payment paypal = new PayPalPayment("TXN1002", 2999, "user@example.com", "securePass");
        Payment upi = new UPIPayment("TXN1003", 1500, "user@upi");

        gateway.process(credit);
        gateway.process(paypal);
        gateway.process(upi);
    }
}
