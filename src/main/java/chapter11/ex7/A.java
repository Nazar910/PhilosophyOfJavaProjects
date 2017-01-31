package chapter11.ex7;

/**
 * Created by pyvov on 12.01.2017.
 */
public class A {
    private int id;

    public A(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "A-"+this.id;
    }
}
