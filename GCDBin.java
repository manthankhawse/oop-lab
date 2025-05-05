import java.util.Scanner;

public class GCDBin{
    public int GCD(int a, int b){
        if(a==0){
            return b;
        }
        if (a > b) {
            GCD(b,a);
        }

        return GCD(b%a,a);
    }

    public String decToBin(int n){
        int x = n;
        StringBuilder s = new StringBuilder();

        while(x>0){
            if(x%2==1){
                s.append('1');
            }else{
                s.append('0');
            }
            x /=2;
        }

        s.reverse();

        return s.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        GCDBin g = new GCDBin();

        System.out.println("The gcd of the given two numbers is " + g.GCD(a,b));

        int n = sc.nextInt();

        System.out.println("The binary of the given decimal is " + g.decToBin(n));
    }
}