package chapter10.ex13;

/**
 * Created by pyvov on 10.01.2017.
 */
abstract class A {
    private int a;
    private int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract void print();
}

public class Main {
    static A getA(int a, int b) {
        return new A(a,b) {
            {
                System.out.println("In init obj");
            }
            public void print() {
                System.out.println("Printed value");
            }
        };
    }

    public static void main(String[] args) {
//        A a = new A(1,2);
        A newA = getA(1,2);
        newA.print();
    }
}
