package chapter9.ex3;

/**
 * Created by pyvov on 03.01.2017.
 */
public class Derived2 extends Base {
    private int i = 1;

    @Override
    void print() {
        System.out.println("Derived2.BinaryFile = " + i);
    }
}
