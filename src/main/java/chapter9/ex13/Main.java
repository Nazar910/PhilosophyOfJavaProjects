package chapter9.ex13;

/**
 * Created by pyvov on 07.01.2017.
 */
interface Base {
    void doSmth();
}
interface Derived1 extends Base {
    void doSmthElse1();
}
interface Derived2 extends Derived1 {
    void doSmthElse2();
}
public class Main implements Derived2{
    public void doSmthElse2() {

    }

    public void doSmthElse1() {

    }

    public void doSmth() {

    }
}
