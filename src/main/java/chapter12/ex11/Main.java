package chapter12.ex11;

/**
 * Created by pyvov on 14.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        g();
    }

    private static void f() throws Exception1 {
        throw new Exception1();
    }

    private static void g() {
        try {
            f();
        } catch (Exception1 exception1) {
            System.err.println("Caught " + exception1);
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.initCause(new Exception2());
            throw runtimeException;
        }
    }
}

class Exception1 extends Exception {}

class Exception2 extends Exception {}
