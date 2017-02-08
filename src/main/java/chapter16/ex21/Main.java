package chapter16.ex21;

import chapter16.custom.ArrayGenerator;
import chapter16.ex18.DecoratedBerylliumSphere;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by nazar on 08/02/17.
 */
class DecoratedBerylliumComparator implements Comparator<DecoratedBerylliumSphere> {
    @Override
    public int compare(DecoratedBerylliumSphere o1, DecoratedBerylliumSphere o2) {
        return o1.getValue() < o2.getValue() ? -1 : (o1.getValue() == o2.getValue() ? 0 : 1);
    }
}

public class Main {
    private static Random r = new Random(47);

    public static void main(String[] args) {
        DecoratedBerylliumSphere[] a =
                ArrayGenerator.array(new DecoratedBerylliumSphere[10],
                        () -> new DecoratedBerylliumSphere(r.nextInt(10)));
        System.out.println("before sorting:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, new DecoratedBerylliumComparator());
        System.out.println("after sorting:");
        System.out.println(Arrays.toString(a));
    }
}
