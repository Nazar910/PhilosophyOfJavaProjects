package chapter10.ex1;

/**
 * Created by pyvov on 08.01.2017.
 */
public class Outer {
    private String s;

    public Outer(String s) {
        this.s = s;
    }

    class Inner {
        public String toString() {
            return s;
        }
    }

    public Inner makeInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer("qwerty");
        Outer.Inner i = o.makeInner();
        System.out.println(i.toString());
    }
}
