package chapter15.generics;

import chapter15.generics.tuples.*;

import static chapter15.generics.tuples.Tuple.*;

/**
 * Created by nazar on 01/02/17.
 */
public class TupleTest2 {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static TwoTuple f2() { return tuple("hi", 47); }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    static SixTuple<Integer, String, Character, Double, Long, Float> j() {
        return tuple(1,"hi", 'c', 1.1, 7L, 2F);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
//        TwoTuple<String, Integer> f2 = f2();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(j());
    }
}
