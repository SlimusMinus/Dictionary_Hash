import java.io.*;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class WordCounter {
    private String inFile;
    private static String testString = "some test string, do some test test";
    private Hashtable words = new Hashtable();

    public Hashtable getWords() {
        return this.words;
    }

    public WordCounter(String inFile) {
        this.inFile = inFile;
    }

    public void countWords() throws IOException {
        Object reader;
        if (this.inFile != null) {
            reader = new FileReader(this.inFile);
        } else {
            reader = new StringReader(testString);
        }

        BufferedReader br = new BufferedReader((Reader)reader);

        for(String line = br.readLine(); line != null; line = br.readLine()) {
            StringTokenizer st = new StringTokenizer(line, " ,./\\;:!?");

            while(st.hasMoreTokens()) {
                String token = st.nextToken();
                if (!this.words.containsKey(token)) {
                    this.words.put(token, 1);
                } else {
                    Object val = this.words.get(token);
                    int n = (Integer)val;
                    ++n;
                    this.words.put(token, n);
                }
            }
        }

        br.close();
    }
}
