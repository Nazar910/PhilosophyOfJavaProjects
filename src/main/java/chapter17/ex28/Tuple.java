package chapter17.ex28;

import chapter15.generics.tuples.*;

/**
 * Created by nazar on 01/02/17.
 */
public class Tuple {
    private static long counter = 0;
    private final long id = counter++;

    public <A, B> TwoTuple<A, B> tuple(A a, B b) {
        return new TwoTuple<A, B>(a, b);
    }

    public <A, B, C> ThreeTuple<A, B, C> tuple(A a, B b, C c) {
        return new ThreeTuple<A, B, C>(a, b, c);
    }

    public <A, B, C, D> FourTuple<A, B, C, D> tuple(A a, B b, C c, D d) {
        return new FourTuple<A, B, C, D>(a, b, c, d);
    }

    public <A, B, C, D, E> FiveTuple<A, B, C, D, E> tuple(A a, B b, C c, D d, E e) {
        return new FiveTuple<A, B, C, D, E>(a, b, c, d, e);
    }

    public <A, B, C, D, E, F> SixTuple<A, B, C, D, E, F> tuple(A a, B b, C c, D d, E e, F f) {
        return new SixTuple<A, B, C, D, E, F>(a, b, c, d, e, f);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (int)id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tuple && id == ((Tuple)obj).id;
    }
}
