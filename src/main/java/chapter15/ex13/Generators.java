package chapter15.ex13;

import chapter15.generics.Fibonacci;
import chapter15.generics.Generator;
import chapter15.generics.coffee.Coffee;
import chapter15.generics.coffee.CoffeeGenerator;

import java.util.*;

/**
 * Created by nazar on 01/02/17.
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static <T> List<T> fill(List<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(
                new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffees) {
            System.out.println(c);
        }
        Set<Integer> fnumbers = fill(
                new HashSet<Integer>(), new Fibonacci(), 12);
        System.out.println(fnumbers);
    }
}
