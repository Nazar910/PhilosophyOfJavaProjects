package chapter11.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by pyvov on 12.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        A[] a = new A[]{new A(1), new A(2), new A(3)};
        List<A> list = new ArrayList<A>(Arrays.asList(a)) ;
        System.out.println(list);
        list.removeAll(list.subList(0,2));
        System.out.println(list);
    }
}
