import java.util.Scanner;

public class ArrayOp{

    public static void reverseArr(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static int[] mergeArr(int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] res = new int[n1+n2];

        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                res[k] = arr1[i];
                i++;
            }else{
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            res[k] = arr1[i];
            k++;
            i++;
        }

        while(j<n2){
            res[k] = arr2[j];
            j++;
            k++;
        }

        return res;
    }

    public static void printMaxMin(int[] arr){
        int mi = arr[0];
        int ma = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i]>ma){
                ma = arr[i];
            }

            if(arr[i]<mi){
                mi = arr[i];
            }
        }

        System.out.println("minimum " + mi);
        System.out.println("maximum " + ma);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        printMaxMin(arr);
        reverseArr(arr);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        int[] res = mergeArr(arr1, arr2);

        for(int i = 0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }

        sc.close();
    }
}