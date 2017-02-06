package chapter15.generics.tuples;

/**
 * Created by nazar on 31/01/17.
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "( " + first + ", " + second + " )";
    }
}
