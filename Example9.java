import java.io.FileReader;
import java.io.IOException;

public class Example9 {
    public static void main(String[] args) {
        int count = 0;
        try(FileReader fr = new FileReader("text.txt")){
            int c = fr.read();
            while(fr.ready()){
                System.out.println((char)c);
                if((char)c != ' ') {
                    count++;
                }
                c = fr.read();
            }
            System.out.println("Total characters in the file " + count);
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
