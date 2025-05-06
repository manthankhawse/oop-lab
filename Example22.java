class BankAccoun {
    // same class as example 8

    // just throw arithmetic execption instead of custom exception
    public void withdraw(int d) throws ArithmeticException {
        if (d > balance) {
            throw new ArithmeticException("Insufficient balance to carry out transaction");
        }
        balance -= d;
    }
}


public class Example22 {
    public static void main(String[] args) {

        // same as example 8

        try {
            // while taking user input handle invalid argument exception

        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Exception occurred " + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception occured "+ e.getMessage());
        }
    }
}
