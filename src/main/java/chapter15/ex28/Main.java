package chapter15.ex28;

/**
 * Created by nazar on 03/02/17.
 */
class Generic1<T> {
    private T item;
    void foo(T item) {
        this.item = item;
    }
}

class Generic2<T> {
    private T item;

    public Generic2(T item) {
        this.item = item;
    }

    T bar() {
        return this.item;
    }
}

public class Main {
//    static <?> void f(T item) {

//    }
}
