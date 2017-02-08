package chapter16.ex1;

import chapter16.arrays.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by nazar on 07/02/17.
 */
public class Main {
    static void f(BerylliumSphere[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        f(new BerylliumSphere[] {new BerylliumSphere(), new BerylliumSphere()});
        BerylliumSphere[] a = { new BerylliumSphere() };
        f(a);
    }
}
