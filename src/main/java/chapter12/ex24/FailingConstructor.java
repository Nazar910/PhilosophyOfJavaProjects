package chapter12.ex24;

/**
 * Created by pyvov on 14.01.2017.
 */
public class FailingConstructor {
    public FailingConstructor() throws Exception {
    }

    void dispose() {}

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor();
            try {
                try {
                    A a = new A();
                    try {
                        a.read();
                    } catch(Exception e) {
                        System.err.println("a.read() failure");
                    } finally {
                        a.dispose();
                    }
                } catch (Exception e) {
                    System.err.println("A failure");
                }
            } finally {
                fc.dispose();
            }
        } catch (Exception e) {
            System.err.println("FailingConstructor failure");
        }
    }
}

class A {
    public A() throws Exception {
    }

    void dispose() {

    }

    void read() throws Exception {

    }
}