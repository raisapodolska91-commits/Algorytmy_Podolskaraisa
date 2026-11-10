package arrayproject_masiv2;

public class LowArray_masiv2 {
    private long[] a;

    public LowArray_masiv2(int size) {
        a = new long[size];
    }

    public void setElem(int index, long value) {
        a[index] = value;
    }

    public long getElem(int index) {
        return a[index];
    }
}