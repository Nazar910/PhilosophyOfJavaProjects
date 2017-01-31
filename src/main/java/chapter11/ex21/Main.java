package chapter11.ex21;

import java.util.*;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    private static String text = "Today is a beautiful day The weather is good " +
            "the sun is shining Beautiful ";
    private static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        for(String s : text.toLowerCase().split(" ")) {
            Integer value = hashMap.get(s);
            hashMap.put(s, value == null ? 1 : value + 1);
        }
        System.out.println(hashMap);
        LinkedList<String> list = new LinkedList<String>(hashMap.keySet());
        Collections.sort(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = hashMap.get(key);
            System.out.println("Word \"" + key + "\" was met " + value + " " + getTimes(value));
        }
    }

    private static String getTimes(Integer value) {
        if (value == 1) return "time";
        return "times";
    }
}
