package chapter7.upcasting;

/**
 * Created by pyvov on 19.12.2016.
 */
public class Frog extends Amphibian {
    public void print(){
        foo(this);
    }

    @Override
    public void foo() {
        System.out.println("foo frog");
    }

    @Override
    public void bar() {
        System.out.println("bar frog");
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.print();
    }
}
