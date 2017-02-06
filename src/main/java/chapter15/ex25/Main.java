package chapter15.ex25;

/**
 * Created by nazar on 03/02/17.
 */
interface IA {
    void a();
}
interface IB {
    void b();
}
class AB implements IA, IB {
    @Override
    public void a() {
        System.out.println("AB::a()");
    }

    @Override
    public void b() {
        System.out.println("AB::b()");
    }
}
public class Main {
    static <T extends IA> void useIA(T item) {
        item.a();
    }

    static <T extends IB>  void useIB(T item) {
        item.b();
    }

    public static void main(String[] args) {
        AB ab = new AB();
        useIA(ab);
        useIB(ab);
    }
}
