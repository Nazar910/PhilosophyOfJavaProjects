package chapter13.ex6;

/**
 * Created by pyvov on 15.01.2017.
 */
class A {
    private int i;
    private long l;
    private float f;
    private double d;

    public A(int i, long l, float f, double d) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("BinaryFile = %d, l = %d\nf = %f, d = %f",i,l,f,d);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(new A(1,1,1,1));
    }
}
