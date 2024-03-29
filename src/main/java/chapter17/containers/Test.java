package chapter17.containers;

/**
 * Created by nazar on 13/02/17.
 */
public abstract class Test<C> {
    String name;

    public Test(String name) {
        this.name = name;
    }

    abstract int test(C container, TestParam testParam);
}
