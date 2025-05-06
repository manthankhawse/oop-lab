import java.util.*;

public class Example29 {
    public static void main(String[] args) {
        int n = 99677;
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

        while(n>0){
            mp.put(n%10, mp.getOrDefault(n%10, 0)+1);
            n = n/10;
        }

        int count = 0;

        for(Integer i : mp.keySet()){
            if(mp.get(i)==1){
                count++;
            }
        }

        System.out.println(count);
    }
}