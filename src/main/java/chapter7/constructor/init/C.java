package chapter7.constructor.init;

/**
 * Created by pyvov on 19.12.2016.
 */
public class C extends A {
    private B b;

    public C() {
        super(0);
    }

    public C(int i, B b) {
        super(i);
        this.b = b;
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
