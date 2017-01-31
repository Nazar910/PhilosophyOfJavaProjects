package chapter13.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyvov on 15.01.2017.
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        return " Infinite recursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v =new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
