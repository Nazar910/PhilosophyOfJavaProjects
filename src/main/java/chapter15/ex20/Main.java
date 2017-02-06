package chapter15.ex20;

/**
 * Created by nazar on 02/02/17.
 */
interface I {
    void a();
    void b();
}

class Impl implements I {
    public void a() {
        System.out.println("Impl::a()");
    }

    public void b() {
        System.out.println("Impl::b()");
    }

    public void c() {
        System.out.println("Impl::c()");
    }
}

public class Main {
    static <T extends I> void foo(T t) {
        t.a();
        t.b();
    }

    public static void main(String[] args) {
        foo(new Impl());
    }
}
