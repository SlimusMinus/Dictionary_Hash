import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        WordCounter wc = new WordCounter("readme.txt");
        wc.countWords();

        for(var item : wc.getSet())
            System.out.println(item);

    }
}