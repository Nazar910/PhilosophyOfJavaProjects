package chapter11.ex24;

import java.util.*;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    private static LinkedHashMap<String, String> hashMap = new LinkedHashMap<String, String>();

    public static void main(String[] args) {
        hashMap.put("one", "1");
        hashMap.put("two", "2");
        hashMap.put("three", "3");
        hashMap.put("four", "4");
        System.out.println(hashMap);
        ArrayList<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        hashMap.clear();
        for (Map.Entry<String, String> entry : list) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(hashMap);
    }
}
