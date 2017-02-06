package chapter15.generics;

/**
 * Created by nazar on 02/02/17.
 */
public class GenericHolder<T> {
    T obj;

    public T get() {
        return obj;
    }

    public void set(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<String>();
        holder.set("Item");
        String s = holder.get();
    }
}
