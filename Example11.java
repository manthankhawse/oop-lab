class CarAssembly implements Runnable{
    private String name;
    private int sleepTime;

    public CarAssembly(String n, int time){
        name = n;
        sleepTime = time;
    }

    public void run(){
        System.out.println(name+" is preparing ");
        try {
            Thread.sleep(sleepTime);
        }catch(InterruptedException e){
            System.out.println("Thread is interrupted " + e.getMessage());

        }
        System.out.println(name+ " is prepared ");
    }
}

public class Example11 {
    public static void main(String[] args) {
        System.out.println("Car Assembly started");
        CarAssembly engine = new CarAssembly("engine", 3000);
        CarAssembly body = new CarAssembly("body", 4000);
        CarAssembly wheels = new CarAssembly("wheels",5000);

        Thread engineThread = new Thread(engine);
        Thread bodyThread = new Thread(body);
        Thread wheelThread = new Thread(wheels);


        engineThread.start();
        bodyThread.start();
        wheelThread.start();

        try{
            engineThread.join();
            bodyThread.join();
            wheelThread.join();
        }catch(InterruptedException e){
            System.out.println("Thread is interrupted " + e.getMessage());

        }

        System.out.println("Car Assembly finished");

    }
}
