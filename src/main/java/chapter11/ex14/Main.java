package chapter11.ex14;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListIterator<Integer> it = list.listIterator();
        it.add(-5);
        it.add(5);
        if (it.hasPrevious()) it.previous();
        int i = -4;
        while (i < 5) {
            if (it.hasNext() && it.hasPrevious()) {
                it.add(i++);
            }
        }
        System.out.println(list);
    }
}
