package chapter11.ex4;

import java.util.*;

/**
 * Created by pyvov on 12.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        int arrayLength = CharactersGenerator.arrayLength();
        String[] array = new String[arrayLength];
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        HashSet<String> hashSet = new HashSet<String>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        for (int i = 0; i < arrayLength; i++) {
            String next = CharactersGenerator.next();
            array[i] = next;
            arrayList.add(next);
            linkedList.add(next);
            hashSet.add(next);
            linkedHashSet.add(next);
            treeSet.add(next);
        }
        System.out.print("[ ");
        for (String s : array ) {
            System.out.print(s + ", ");
        }
        System.out.println(" ]");
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
