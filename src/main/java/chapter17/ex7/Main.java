package chapter17.ex7;

import chapter17.containers.Countries;

import java.util.*;

/**
 * Created by nazar on 11/02/17.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        arrayList.addAll(Countries.names(5));
        linkedList.addAll(Countries.names(5));


        printList(arrayList);
        printList(linkedList);

        ListIterator<String> lit = linkedList.listIterator();
        Iterator<String> it = arrayList.iterator();
        while (lit.hasNext() && it.hasNext()) {
            lit.next();
            lit.add(it.next());
        }

        printList(arrayList);
        printList(linkedList);
    }

    public static <T> void printList(List<T> list) {
        Iterator<T> it = list.iterator();
        System.out.print("[");
        if (it.hasNext()) System.out.print(it.next());
        while (it.hasNext()) {
            System.out.print(", " + it.next());
        }
        System.out.println("]");
    }
}
