public class NumCliArgs {
    public static void main(String[] args) {
        int sum = 0;
        try{
            for(int i = 0; i<args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }

            int avg = sum/args.length;
            System.out.println(avg);
        }catch(NumberFormatException e){
            System.out.println("Invalid number format");
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Divide by zero");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }

    }
}
