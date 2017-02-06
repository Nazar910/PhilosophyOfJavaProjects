package chapter15.generics;

/**
 * Created by nazar on 01/02/17.
 */
public class CountedObject {
    private static int counter = 0;
    private final long id = counter++;
    public long id() { return this.id; }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
