class BankAccountMulti {
    private int accountNumber;
    private double balance;

    public BankAccountMulti(int accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + ": Deposited " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + ": Withdrew " + amount + " | Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + ": Insufficient funds to withdraw " + amount);
        }
    }

    public void transferTo(BankAccountMulti target, double amount) {
        synchronized (this) {
            synchronized (target) {
                if (balance >= amount) {
                    this.balance -= amount;
                    target.balance += amount;
                    System.out.println(Thread.currentThread().getName() + ": Transferred " + amount + " to Account " + target.accountNumber);
                } else {
                    System.out.println(Thread.currentThread().getName() + ": Transfer failed due to insufficient balance.");
                }
            }
        }
    }

    public double getBalance() {
        return balance;
    }
}

class TransactionTask implements Runnable {
    private BankAccountMulti acc1;
    private BankAccountMulti acc2;

    public TransactionTask(BankAccountMulti acc1, BankAccountMulti acc2) {
        this.acc1 = acc1;
        this.acc2 = acc2;
    }

    @Override
    public void run() {
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.transferTo(acc2, 300);
    }
}


public class Example14 {
    public static void main(String[] args) {
        BankAccountMulti accountA = new BankAccountMulti(1001, 5000);
        BankAccountMulti accountB = new BankAccountMulti(1002, 3000);
        BankAccountMulti accountC = new BankAccountMulti(1003, 2000);

        Thread t1 = new Thread(new TransactionTask(accountA, accountB), "User-1");
        Thread t2 = new Thread(new TransactionTask(accountB, accountC), "User-2");

        t1.start();
        t2.start();
    }
}
