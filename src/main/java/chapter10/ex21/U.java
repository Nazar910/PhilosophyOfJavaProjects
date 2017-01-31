package chapter10.ex21;

/**
 * Created by pyvov on 11.01.2017.
 */
public interface U {
    void u();

    void t();

    void v();
}

class A {
    private static int count = 0;
    private int i;

    public A() {
        i = count++;
    }

    U getU() {
        return new U() {
            public void u() {
                System.out.println(i + "-A.u()");
            }

            public void t() {
                System.out.println(i + "-A.t()");
            }

            public void v() {
                System.out.println(i + "-A.v()");
            }
        };
    }
}

class B {
    private U[] items;
    private int i = 0;

    public B(int size) {
        items = new U[size];
    }

    public void add(U u) {
        items[i++] = u;
    }

    public void setNull(int i) {
        items[i] = null;
    }

    public void foreach() {
        for (int k = 0; k < items.length; k++) {
            if (items[k] != null) {
                items[k].t();
            }
        }
    }

    public static void main(String[] args) {
        A a0 = new A();
        A a1 = new A();
        A a2 = new A();
        B b = new B(3);
        b.add(a0.getU());
        b.add(a1.getU());
        b.add(a2.getU());
        b.foreach();
        b.setNull(0);
        b.foreach();
    }
}
