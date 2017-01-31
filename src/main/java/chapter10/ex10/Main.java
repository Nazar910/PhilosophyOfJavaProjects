package chapter10.ex10;

/**
 * Created by pyvov on 10.01.2017.
 */
interface I {
    void print();
}
public class Main {
    public I impl() {
        return new I() {
            public void print() {
                System.out.println("Implemented in anonymous class");
            }
        };
    }

    public static void main(String[] args) {
        Main m  = new Main();
        I i = m.impl();
        i.print();
    }
}
