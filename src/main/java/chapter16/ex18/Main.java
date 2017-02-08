package chapter16.ex18;

import chapter16.arrays.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by nazar on 08/02/17.
 */


public class Main {
    public static void main(String[] args) {
        DecoratedBerylliumSphere[] ar = new DecoratedBerylliumSphere[10];
        Arrays.fill(ar, new DecoratedBerylliumSphere());
        System.out.println("ar: " + Arrays.toString(ar));
        DecoratedBerylliumSphere[] newAr = new DecoratedBerylliumSphere[5];
        System.arraycopy(ar, ar.length/2, newAr, 0, newAr.length);
        System.out.println("newAr: " + Arrays.toString(newAr));
        ar[0].setValue(1);
        System.out.println("ar: " + Arrays.toString(ar));
        System.out.println("newAr: " + Arrays.toString(newAr));
    }
}
