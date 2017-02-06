package chapter15.ex42;

/**
 * Created by nazar on 07/02/17.
 */
public class B {
    private double value;

    public B(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value + "";
    }
}
