import java.util.*;


public class Example5B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            list.add(x);
        }

        // for loop
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println(); 

        // advanced for loop    
        for(int i : list){
            System.out.print(i+" ");
        }

        System.out.println();

        // iterator
        Iterator<Integer> it = list.iterator();        
        while(it.hasNext()){
            int i = it.next();
            System.out.print(i + " ");
        }

        System.out.println();

        int check = sc.nextInt();

        System.out.println("The value check exists in the arraylist " + list.contains(check));

        int newElm = sc.nextInt();

        int idx = sc.nextInt();
        System.out.println("list after adding element at given index ");

        list.add(idx, newElm);
        Iterator<Integer> it1 = list.iterator();        
        while(it1.hasNext()){
            int i = it1.next();
            System.out.print(i + " ");
        }


    }
}