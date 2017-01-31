package chapter12.ex10;

/**
 * Created by pyvov on 14.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            g();
        } catch (Exception2 exception2) {
            System.err.println("Caught " + exception2);
        }
    }

    private static void f() throws Exception1 {
        throw new Exception1();
    }

    private static void g() throws Exception2{
        try {
            f();
        } catch (Exception1 exception1) {
            System.err.println("Caught " + exception1);
            throw new Exception2();
        }
    }
}

class Exception1 extends Exception {}
class Exception2 extends Exception {}
