package chapter11.ex12;

import java.util.*;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> list2 = new ArrayList<Integer>(list1);
        ListIterator<Integer> it1 = list1.listIterator();
        ListIterator<Integer> it2 = list2.listIterator(list2.size());
        while (it1.hasNext() && it2.hasPrevious()) {
            it2.previous();
            it2.set(it1.next());
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}
