package chapter17.ex41;

import chapter15.generics.Generator;
import chapter16.arrays.RandomGenerator;

import java.util.*;

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
        return a.compareTo(o.a);
    }

    @Override
    public String toString() {
//        return "A: a = " + a + "; b = " + b;
        return Integer.toString(hashCode());
    }

    public String getB() {
        return b;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof A &&
                a.compareTo(((A)obj).a) != 0 &&
                b.compareTo(((A)obj).b) != 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        for (char c: a.toCharArray()) result = 37*result + (int)c;
        for (char c: b.toCharArray()) result = 37*result + (int)c;
        return result;
    }
}

class AGenerator implements Generator<A> {
    static Generator<String> gen = new RandomGenerator.String(1);
    @Override
    public A next() {
        return new A(gen.next(), gen.next());
    }
}


public class Main {
    public static void main(String[] args) {
        HashMap<A,Integer> map = new HashMap<>();
        AGenerator gen = new AGenerator();
        for (int i = 0; i < 5; i++) {
            map.put(gen.next(), i);
        }
        System.out.println(map);
    }
}
