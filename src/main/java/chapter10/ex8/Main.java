package chapter10.ex8;

/**
 * Created by pyvov on 10.01.2017.
 */
interface I {
    void print();
}
public class Main {
    public I getImpl() {
        class Inner implements I {
            public void print() {
                System.out.println("It's interface implementation");
            }
        }
        return new Inner();
    }

    public static void main(String[] args) {
        Main m = new Main();
        I i  = m.getImpl();
        i.print();
    }
}
