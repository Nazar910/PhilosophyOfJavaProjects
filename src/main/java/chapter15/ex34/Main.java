package chapter15.ex34;

/**
 * Created by nazar on 05/02/17.
 */
abstract class Base<T extends Base<T>> {
    abstract T setAndReturn(T item);
    T f(T item) {
        return setAndReturn(item);
    }
}

class Derived extends Base<Derived> {
    @Override
    Derived setAndReturn(Derived item) {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Derived derived = new Derived();
        System.out.println(derived.setAndReturn(new Derived()));
    }
}
