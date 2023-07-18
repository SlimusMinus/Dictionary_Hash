import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {

        WordCounter wc = new WordCounter("readme.txt");
        wc.countWords();
        Iterator var2 = wc.getWords().entrySet().iterator();

        while(var2.hasNext()) {
            Object obj = var2.next();
            System.out.println(obj);
        }
    }
}