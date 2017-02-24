package chapter9.ex3;

/**
 * Created by pyvov on 03.01.2017.
 */
public class Derived1 extends Base {
    private int i = 1;

    @Override
    void print() {
        System.out.println("Derived1.BinaryFile = " + i);
    }
}
