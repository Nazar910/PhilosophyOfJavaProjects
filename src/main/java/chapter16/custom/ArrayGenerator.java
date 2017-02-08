package chapter16.custom;

import chapter15.generics.Generator;

/**
 * Created by nazar on 08/02/17.
 */
public class ArrayGenerator {
    public static <T> T[] array(T[] ar, Generator<T> generator) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = generator.next();
        }
        return ar;
    }
}
