import java.util.*;

public class Example4A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            for(int j = 1; j<=n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i+1; j++){
                System.out.print(i+1 + " ");
            }
            
            System.out.println();
        }
    }
}