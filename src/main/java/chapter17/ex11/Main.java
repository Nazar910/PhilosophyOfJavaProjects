package chapter17.ex11;

import chapter10.ex18.I;
import chapter16.arrays.CountringGenerator;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by nazar on 12/02/17.
 */
class A implements Comparable<A> {
    private static Random rand = new Random(47);
    private Integer i = rand.nextInt(100);

    @Override
    public String toString() {
        return Integer.toString(i);
    }

    @Override
    public int compareTo(A o) {
        return i < o.i ? -1 : i.equals(o.i) ? 0 : 1;
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityQueue<A> queue = new PriorityQueue<>();
        queue.add(new A());
        queue.add(new A());
        queue.add(new A());
        System.out.println(queue);
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

    }
}
