package chapter16.ex14;

import chapter15.generics.Generator;
import chapter16.arrays.CountringGenerator;

import java.util.Arrays;

/**
 * Created by nazar on 07/02/17.
 */
public class Main {
    public static void main(String[] args) {
        final int SIZE = 10;
        boolean[] booleans = new boolean[SIZE];
        Generator<Boolean> booleanGenerator = new CountringGenerator.Boolean();
        byte[] bytes = new byte[SIZE];
        Generator<Byte> byteGenerator = new CountringGenerator.Byte();
        char[] chars =  new char[SIZE];
        Generator<Character> characterGenerator = new CountringGenerator.Character();
        short[] shorts = new short[SIZE];
        Generator<Short> shortGenerator = new CountringGenerator.Short();
        int[] ints = new int[SIZE];
        Generator<Integer> integerGenerator = new CountringGenerator.Integer();
        long[] longs = new long[SIZE];
        Generator<Long> longGenerator = new CountringGenerator.Long();
        float[] floats = new float[SIZE];
        Generator<Float> floatGenerator = new CountringGenerator.Float();
        double[] doubles = new double[SIZE];
        Generator<Double> doubleGenerator = new CountringGenerator.Double();
        for (int i = 0; i < SIZE; i++) {
            booleans[i] = booleanGenerator.next();
            bytes[i] = byteGenerator.next();
            chars[i] = characterGenerator.next();
            shorts[i] = shortGenerator.next();
            ints[i] = integerGenerator.next();
            longs[i] = longGenerator.next();
            floats[i] = floatGenerator.next();
            doubles[i] = doubleGenerator.next();
        }
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(shorts));
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(longs));
        System.out.println(Arrays.toString(floats));
        System.out.println(Arrays.toString(doubles));

    }
}
