
class Printer{
    public synchronized void printNumbers(){
        for(int i = 1; i<=10; i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }

            System.out.println(Thread.currentThread().getName()+ " " +i);
        }
    }
}

class PrinterTask implements Runnable{
    private Printer printer;
    public PrinterTask(Printer p){
        printer = p;
    }

    @Override
    public void run() {
        printer.printNumbers();
    }
}


public class Example23 {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();
        Thread t1 = new Thread(new PrinterTask(sharedPrinter), "thread1");
        Thread t2 = new Thread(new PrinterTask(sharedPrinter), "thread2");

        System.out.println("printing started");

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("printing finished");
    }

}
