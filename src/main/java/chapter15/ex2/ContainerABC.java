package chapter15.ex2;

/**
 * Created by nazar on 31/01/17.
 */
public class ContainerABC<T> {
    private T a;
    private T b;
    private T c;

    public ContainerABC(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }

    public static void main(String[] args) {
        ContainerABC<Integer> c = new ContainerABC<Integer>(1,2,3);
        System.out.println(String.format("%d %d %d", c.getA(), c.getB(), c.getC()));
    }
}
