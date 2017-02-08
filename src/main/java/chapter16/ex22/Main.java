package chapter16.ex22;

import chapter16.arrays.CountringGenerator;
import chapter16.arrays.RandomGenerator;
import chapter16.custom.ArrayGenerator;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by nazar on 08/02/17.
 */
public class Main {
    private static Random r = new Random(47);
    public static void main(String[] args) {
        Integer[] a = ArrayGenerator.array(new Integer[10], new RandomGenerator.Integer());
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < 10; i++) {
            int index = r.nextInt(10);
            int location = Arrays.binarySearch(a, a[index]);
            System.out.println("a[" + index + "] = " + location);
        }
    }
}
