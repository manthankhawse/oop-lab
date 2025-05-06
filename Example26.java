import java.util.Scanner;

public class Example26 {

    public int moveDups(int[] arr){
        int idx = 0;

        for(int i = 1; i<arr.length; i++){
            if(arr[i]!=arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx+1];
                arr[idx+1] = temp;
                idx++;
            }
        }

        return idx+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i]  = sc.nextInt();
        }

        Example26 mv = new Example26();

        int ct = mv.moveDups(arr);

        for(int i = ct; i<arr.length; i++){
            arr[i] = -1;
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
