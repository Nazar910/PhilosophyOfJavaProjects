package chapter9.ex4;


/**
 * Created by pyvov on 03.01.2017.
 */
public class Derived extends Base {
    public static void ref() {
//        ((Derived)super).print();
    }
    public void print() {
        System.out.println("Derived");
    }
}
