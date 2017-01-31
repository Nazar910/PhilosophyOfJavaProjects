package chapter9.ex14;

/**
 * Created by pyvov on 07.01.2017.
 */
interface Base1 {
    void base11();

    void base12();
}

interface Base2 {
    void base21();

    void base22();
}

interface Base3 {
    void base31();

    void base32();
}

interface Derived extends Base1, Base2, Base3 {
    void derived();
}

abstract class BaseClass {
    public abstract void baseClass();

    public void baseClass2() {

    }
}

class DerivedClass extends BaseClass implements Derived {
    public void base11() {

    }

    public void base12() {

    }

    public void base21() {

    }

    public void base22() {

    }

    public void base31() {

    }

    public void base32() {

    }

    public void derived() {

    }

    @Override
    public void baseClass() {

    }
}

public class Main {
    public static void u(Base1 x) {
        x.base11();
    }

    public static void t(Base2 x) {
        x.base21();
    }

    public static void v(Base3 x) {
        x.base31();
    }

    public static void w(Derived x) {
        x.derived();
    }

    public static void z(BaseClass x) {
        x.baseClass();
    }

    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        u(obj);
        t(obj);
        v(obj);
        w(obj);
        z(obj);
    }
}
