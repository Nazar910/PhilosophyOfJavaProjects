package chapter17.containers;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by nazar on 10/02/17.
 */
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;
    public static void basicTest(List<String> a) {
        a.add(1, "x");
        a.add("x");
        //adding collection
        a.addAll(Countries.names(10));
        //adding collection from 3 position
        a.addAll(3, Countries.names(10));
        b = a.contains("1");
        // all collection
        b = a.containsAll(Countries.names(10));
        //lists provide random access -
        //fast for ArrayList, slow for LinkedList
        s = a.get(1);
        i = a.indexOf("1");
        b = a.isEmpty();
        it = a.iterator();
        lit = a.listIterator();
        lit = a.listIterator(3);
        i = a.lastIndexOf("1");
        a.remove(1);
        a.remove("3");
        a.set(1, "y");
        //leave only elements that arg has
        a.retainAll(Countries.names(10));

    }
}














