package chapter11.ex18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    private static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    private static LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();

    public static void main(String[] args) {
        hashMap.put("One",1);
        hashMap.put("Two",2);
        hashMap.put("Three",3);
        hashMap.put("Four",4);
        hashMap.put("Five",5);
        System.out.println(hashMap);
        linkedHashMap.putAll(new TreeMap<String, Integer>(hashMap));
        System.out.println(linkedHashMap);
    }
}
