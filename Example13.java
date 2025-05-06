import java.util.HashMap;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String s = sc.nextLine();
            mp.put(s, mp.getOrDefault(s, 0)+1);
        }
        int mxFreq = 0;
        String res = "";
        for(String s : mp.keySet()){
            if(mp.get(s)>mxFreq){
                mxFreq = mp.get(s);
                res = s;
            }
        }



        System.out.println("Max freq " + mxFreq);
        System.out.println("Max Freq elem " + res);
    }
}
