package chapter12.ex25;

/**
 * Created by pyvov on 14.01.2017.
 */
public class C extends B{
    @Override
    void f() throws CException {
        throw new CException();
    }

    public static void main(String[] args) {
        try {
            A ac = new C();
            ac.f();
        } catch (CException e) {
            System.err.println("CException");
        } catch (BException e) {
            System.err.println("BException");
        } catch (AException e) {
            System.err.println("AException");
        }
    }
}

class A {
    void f() throws AException {
        throw new AException();
    }
}

class B extends A {
    @Override
    void f() throws BException {
        throw new BException();
    }
}

class AException extends Exception {}
class BException extends AException {}
class CException extends BException {}