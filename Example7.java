import java.util.HashMap;
import java.util.Scanner;

public class Example7 {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void printFreq(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        System.out.println("The frequency of different characters is:");
        for (char c : mp.keySet()) {
            System.out.println("Key: " + c + " Value: " + mp.get(c));
        }
    }

    public static String removeSpace(String s) {
        StringBuilder builder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != ' ') {
                builder.append(c);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome and frequency: ");
        String str = sc.nextLine();
        System.out.println("The given string is a palindrome: " + isPalindrome(str));

        printFreq(str);

        System.out.print("Enter a string to remove spaces: ");
        String strw = sc.nextLine();
        System.out.println("String after removing whitespaces: " + removeSpace(strw));

        sc.close();
    }
}
