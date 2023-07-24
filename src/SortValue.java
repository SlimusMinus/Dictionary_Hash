
public class SortValue implements Comparable<SortValue>{
    private String value;
    private int key;

    public SortValue(String value, int key) {
        this.value = value;
        this.key = key;
    }

    @Override
    public String toString() {
        return value + " : " + key;
    }
    @Override
    public int compareTo(SortValue s) {
        int res = key - s.key;
        if(res == 0) res = value.compareTo(s.value);
        return res;
    }
}
