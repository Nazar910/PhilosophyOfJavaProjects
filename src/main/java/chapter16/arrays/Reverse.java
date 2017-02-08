package chapter16.arrays;

import chapter16.custom.ArrayGenerator;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by nazar on 08/02/17.
 */
public class Reverse {
    public static void main(String[] args) {
        CompType[] a = ArrayGenerator.array(new CompType[12], CompType.generator());
        System.out.println("before sorting:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("after sorting:");
        System.out.println(Arrays.toString(a));
    }
}
