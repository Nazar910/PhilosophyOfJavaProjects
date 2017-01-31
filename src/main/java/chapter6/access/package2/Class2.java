package chapter6.access.package2;

import chapter6.access.package1.Class1;

/**
 * Created by pyvov on 19.12.2016.
 */
public class Class2 extends Class1 {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.foo();
        //! class1.bar();
        Class2 class2 = new Class2();
        class2.bar();
    }
}
