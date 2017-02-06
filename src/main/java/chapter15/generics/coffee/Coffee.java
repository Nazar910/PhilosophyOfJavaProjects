package chapter15.generics.coffee;

/**
 * Created by nazar on 01/02/17.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName()+ " " + id;
    }
}
