package chapter16.arrays;

/**
 * Created by nazar on 07/02/17.
 */
public class BerylliumSphere {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Sphere " + id;
    }

}
