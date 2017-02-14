package chapter17.ex40;

import chapter15.generics.Generator;
import chapter16.arrays.RandomGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by nazar on 14/02/17.
 */
class A  implements Comparable<A>{
    String a, b;

    public A(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(A o) {
        return a.compareToIgnoreCase(o.a);
    }

    @Override
    public String toString() {
        return "A: a = " + a + "; b = " + b;
    }

    public String getB() {
        return b;
    }
}

class AGenerator implements Generator<A> {
    static Generator<String> gen = new RandomGenerator.String();
    @Override
    public A next() {
        return new A(gen.next(), gen.next());
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList<A> list = new ArrayList<A>();
        AGenerator gen = new AGenerator();
        for (int i = 0; i < 10; i++) {
            list.add(gen.next());
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.comparing(A::getB));
        System.out.println(list);
    }
}
