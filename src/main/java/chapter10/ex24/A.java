package chapter10.ex24;

/**
 * Created by pyvov on 11.01.2017.
 */
class B {
    class InnerB {
        private int i;

        public InnerB(int i) {
            this.i = i;
        }
    }
}
public class A {
    class InnerA extends B.InnerB {
        public InnerA(B b,int i) {
            b.super(i);
        }
    }

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        A.InnerA i = a.new InnerA(b,1);
    }
}
