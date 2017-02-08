package chapter16.ex12;

import chapter15.generics.Generator;
import chapter16.arrays.CountringGenerator;

import java.util.Arrays;

/**
 * Created by nazar on 07/02/17.
 */
public class Main {
    public static void main(String[] args) {
        double[] arr = new double[5];
        Generator<Double> gen = new CountringGenerator.Double();
        for (int i = 0; i < 5; i++) {
            arr[i] = gen.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}
