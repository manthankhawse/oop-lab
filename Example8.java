class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String m) {
        super(m);
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int b) {
        balance = b;
    }

    public void deposit(int d) {
        balance += d;
    }

    public void withdraw(int d) throws InsufficientBalanceException {
        if (d > balance) {
            throw new InsufficientBalanceException("Insufficient balance to carry out transaction");
        }
        balance -= d;
    }


}

public class Example8{
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000);
        try {
            b.withdraw(100);
            System.out.println("Withdrew 100 successfully");

            b.deposit(1000);
            b.withdraw(2000);
            System.out.println("Withdrew 2000 successfully");

        } catch (InsufficientBalanceException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}