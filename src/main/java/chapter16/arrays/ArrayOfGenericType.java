package chapter16.arrays;

/**
 * Created by nazar on 07/02/17.
 */
public class ArrayOfGenericType<T> {
    T[] array;

    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
//        array = new T[size];
        array = (T[]) new Object[size];
    }
}
