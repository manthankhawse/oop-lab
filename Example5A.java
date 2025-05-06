import java.util.*;

public class Example5A {
    public static boolean isPrime(int n){
        if(n<=2) return false;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i<=25; i++){
            list.add(i);
        }

        Iterator<Integer> it1 = list.iterator();        
        while(it1.hasNext()){
            int i = it1.next();
            System.out.print(i + " ");
        }

        for(int i = 0; i<list.size(); i++){
            if(isPrime(list.get(i))){
                list.remove(i);
            }
        }
        
        Iterator<Integer> it = list.iterator();        
        while(it.hasNext()){
            int i = it.next();
            System.out.print(i + " ");
        }


    }
}