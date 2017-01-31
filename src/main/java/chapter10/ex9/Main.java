package chapter10.ex9;

/**
 * Created by pyvov on 10.01.2017.
 */
interface I {
    void print();
}
public class Main {
    public static void main(String[] args) {
        TestMain test = new TestMain();
        I i = test.getInner();
        i.print();
    }

}
class TestMain {
    private class Inner implements I {
        public void print() {
            System.out.println("Inner implementation of I");
        }
    }

    public I getInner() {
        return new Inner();
    }
}