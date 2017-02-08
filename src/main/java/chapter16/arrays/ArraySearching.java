package chapter16.arrays;

import chapter15.generics.Generator;
import chapter16.custom.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by nazar on 08/02/17.
 */
public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> gen = new RandomGenerator.Integer();
        int[] a = ConvertTo.primitive(ArrayGenerator.array(new Integer[10], gen));
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        while(true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            if (location >= 0) {
                System.out.println("Location of " + r + " is " + location
                + ", a[" + location + "] = " + a[location]);
                break;
            }
        }
    }
}
