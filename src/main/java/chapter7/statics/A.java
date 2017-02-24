package chapter7.statics;

/**
 * Created by pyvov on 19.12.2016.
 */
public class A {
    private static int i = printInit("A.BinaryFile initialized");
    public A() {
    }
    static int printInit(String s){
        System.out.println(s);
        return 0;
    }
}
class B extends A{

}
