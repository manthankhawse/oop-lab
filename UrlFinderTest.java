
import java.util.*;

class UrlFinder {
    private String url;

    public UrlFinder(String s) {
        url = s;
    }

    public boolean urlCheck(String s) {
        return url.equals(s);
    }
}

public class UrlFinderTest {
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