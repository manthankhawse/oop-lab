import java.util.Scanner;

public class Example20 {

    public boolean isVowel(char c){
        return c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    private int count = 0;

    public String remVow(String st) {
        StringBuilder s = new StringBuilder();
        for (char c : st.toCharArray()) {
            if (!isVowel(c)) {
                s.append(c);
            } else {
                count++;
            }
        }
        return s.toString();
    }

    public int getCount() {
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Example20 vowRem = new Example20();
        String res = vowRem.remVow(s);
        System.out.println(res);
        System.out.println(vowRem.getCount());
    }
}
