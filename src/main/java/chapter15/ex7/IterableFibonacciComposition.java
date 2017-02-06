package chapter15.ex7;

import chapter15.generics.Fibonacci;

import java.util.Iterator;

/**
 * Created by nazar on 01/02/17.
 */
public class IterableFibonacciComposition implements Iterable<Integer> {
    private Fibonacci fibonacci = new Fibonacci();
    private int n;

    public IterableFibonacciComposition(int n) {
        this.n = n;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n > 0;
            }

            public Integer next() {
                n--;
                return fibonacci.next();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacciComposition(18)) {
            System.out.print(i + " ");
        }
    }
}
