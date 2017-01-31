package chapter11.ex11;

import java.util.*;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    private static void iterate(Iterator it) {
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList("a","abc","bcx"));
        LinkedHashSet<Double> linkedHashSet = new LinkedHashSet<Double>(Arrays.asList(5.0,6.6,7.1,8.2));
        iterate(arrayList.iterator());
        iterate(linkedList.iterator());
        iterate(linkedHashSet.iterator());
    }
}
