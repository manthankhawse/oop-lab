
import java.util.*;

class UrlFinder {
    private String url;

    public UrlFinder(String s) {
        url = s;
    }
    // more complex url matching can be done using regex
    public boolean urlCheck(String s) {
        return url.equals(s);
    }
}

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the original URL:");
        String s = sc.nextLine();

        UrlFinder u = new UrlFinder(s);

        System.out.println("Enter the URL to check:");
        String str = sc.nextLine();
        
        System.out.println("The URLs are the same: " + u.urlCheck(str));
    }
}