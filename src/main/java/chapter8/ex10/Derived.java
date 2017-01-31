package chapter8.ex10;

/**
 * Created by pyvov on 30.12.2016.
 */
public class Derived extends Base {
    @Override
    public void bar() {
        System.out.println("base:bar()");
    }

    public static void main(String[] args) {
        Derived a = new Derived();
        a.foo();
        Base b  = new Base();
        b.foo();
        Base c = new Derived();
        c.foo();
    }
}
