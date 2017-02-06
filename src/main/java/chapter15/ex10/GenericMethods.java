package chapter15.ex10;

/**
 * Created by nazar on 01/02/17.
 */
public class GenericMethods {
    public <T, U> void f(T t, U u, Integer v) {
        System.out.println(t.getClass().getName() + " | "
        + u.getClass().getName() + " | " + v.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 1.1, 1);
    }
}
