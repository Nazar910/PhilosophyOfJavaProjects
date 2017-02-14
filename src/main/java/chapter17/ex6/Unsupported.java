package chapter17.ex6;

import java.util.*;

/**
 * Created by nazar on 09/02/17.
 */
public class Unsupported {
    static void test(String message, List<String> list) {
        System.out.println("--- " + message + " ---");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1,8);

        Collection<String> c2 = new ArrayList<>(list);
        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("retainAll(): " + e);
        }
        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("removeAll(): " + e);
        }
        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("clear(): " + e);
        }
        try {
            c.add("X");
        } catch (Exception e) {
            System.out.println("add(): " + e);
        }
        try {
            c.addAll(c2);
        } catch (Exception e) {
            System.out.println("addAll(): " + e);
        }
        try {
            c.remove("C");
        } catch (Exception e) {
            System.out.println("remove(): " + e);
        }
        try {
            list.set(0, "X");
        } catch (Exception e) {
            System.out.println("List.set(): " + e);
        }
        try {
            list.add(2, "A");
        } catch (Exception e) {
            System.out.println("List.add(int index, E element): " + e);
        }
        try {
            list.addAll(2,new ArrayList<String>(Arrays.asList("F", "C")));
        } catch (Exception e) {
            System.out.println("List.addAll(index, elements): " + e);
        }
        try {
            list.remove(1);
        } catch (Exception e) {
            System.out.println("List.remove(index): " + e);
        }
    }

    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy", new ArrayList<String>(list));
        test("Arrays.asList",list);
        test("Unmodifiable list", Collections.unmodifiableList(new ArrayList<>(list)));
    }
}
