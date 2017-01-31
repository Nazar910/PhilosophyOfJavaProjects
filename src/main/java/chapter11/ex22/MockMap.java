package chapter11.ex22;

/**
 * Created by pyvov on 13.01.2017.
 */
public class MockMap {
    private String key;
    private int value;

    public MockMap(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + this.key + "=" + this.value + ")";
    }
}
