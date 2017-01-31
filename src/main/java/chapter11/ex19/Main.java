package chapter11.ex19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    private static HashSet<String> hashSet = new HashSet<String>();
    private static LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

    public static void main(String[] args) {
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        System.out.println(hashSet);
        linkedHashSet.addAll(new TreeSet<String>(hashSet));
        System.out.println(linkedHashSet);
    }
}
