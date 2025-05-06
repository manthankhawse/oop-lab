import java.util.ArrayList;
import java.util.Scanner;

public class Example12 {
    private ArrayList<Integer> arr;

    public Example12(){
        arr = new ArrayList<Integer>();
    }

    public void insertElm(int idx, int elm){
        arr.add(idx, elm);
    }

    public void update(int idx, int elm){
        arr.set(idx, elm);
    }

    public int sum(int i, int j){
        int sum = 0;
        for(int k = i; k<=j; k++){
            sum+=arr.get(k);
        }

        return sum;
    }

    public void delete(int idx){
        arr.remove(idx);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Example12 a = new Example12();
        while(true){
            int x;
            x = sc.nextInt();
            if(x==0){
                break;
            }else if(x==1){
                int idx = sc.nextInt();
                int elm = sc.nextInt();

                a.insertElm(idx, elm);
            }else if(x==2){
                int idx = sc.nextInt();
                int elm = sc.nextInt();

                a.update(idx, elm);
            }else if(x==3){
                int idx = sc.nextInt();

                a.delete(idx);
            }else{
                int i = sc.nextInt();
                int j = sc.nextInt();

                a.insertElm(i, j);
            }
        }

        sc.close();
    }
}
