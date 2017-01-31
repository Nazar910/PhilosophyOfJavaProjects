package chapter10.ex5;

/**
 * Created by pyvov on 08.01.2017.
 */
public class Outer {
    class Inner {

    }
}
class Other {
    public static void main(String[] args) {
        Outer.Inner i = (new Outer()).new Inner();
    }
}
