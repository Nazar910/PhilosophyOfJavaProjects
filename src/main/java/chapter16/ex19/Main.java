package chapter16.ex19;

import java.util.Arrays;

/**
 * Created by nazar on 08/02/17.
 */
class A implements Comparable<A> {
    private int value;

    public A(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof A)) throw new RuntimeException("Should use equals to the same class object");
        A a = (A) obj;
        return this.getValue() == a.getValue();
    }

    @Override
    public int compareTo(A o) {
        return this.getValue() < o.getValue() ? -1 : (this.getValue() == o.getValue()? 0 : 1);
    }
}

public class Main {
    public static void main(String[] args) {
        A[] ar1 = new A[10];
        A[] ar2 = new A[10];
        Arrays.fill(ar1, new A(1));
        Arrays.fill(ar2, new A(1));
        System.out.println(Arrays.equals(ar1, ar2));
        int location = Arrays.binarySearch(ar1, new A(1));
        System.out.println("location = " + location);
    }
}
