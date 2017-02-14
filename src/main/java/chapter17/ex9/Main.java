package chapter17.ex9;

import chapter15.generics.Generator;
import chapter16.arrays.RandomGenerator;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by nazar on 12/02/17.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        Generator<String> gen = new RandomGenerator.String();
        for (int i = 0; i < 10; i++) {
            treeSet.add(gen.next());
        }
        System.out.println(treeSet);
    }
}
