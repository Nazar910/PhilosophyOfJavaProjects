package chapter16.ex2;

import chapter16.arrays.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by nazar on 07/02/17.
 */
public class Main {
    static BerylliumSphere[] f(int n) {
        BerylliumSphere[] a = new BerylliumSphere[n];
        Arrays.asList(a).replaceAll(ai -> ai = new BerylliumSphere());
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(10)));
    }
}
