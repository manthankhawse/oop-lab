import java.util.*;


public class Example4B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        int[][] arr = new int[n][];

        for(int i = 1; i<=n; i++){
            arr[i-1] = new int[i];

            arr[i-1][0] = 1;
            arr[i-1][i-1] = 1;

            if(i-2>0){
                for(int j = 1; j<i-1; j++){
                    arr[i-1][j] = arr[i-2][j-1]+arr[i-2][j];
                }
            }
        }

        for(int i = 0; i<n; i++){
            
            for(int j = 1; j<=n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}