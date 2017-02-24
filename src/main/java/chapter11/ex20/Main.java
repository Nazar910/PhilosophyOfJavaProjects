package chapter11.ex20;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        String str = "A E I O U Y a e BinaryFile o u y";
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (String s : str.split(" ")) {
            hashMap.put(s, 0);
        }
        String[] words = {"A", "add", "addAll", "args", "B", "C", "class", "lemon"};
        int globalCount = 0;
        for (String s : words) {
            int count = 0;
            for (char c : s.toCharArray()) {
                String key = Character.toString(c);
                Integer i = hashMap.get(key);
                if (i != null) {
                    hashMap.put(key, i+1);
                    count++;
                    globalCount++;
                }
            }
            System.out.println("Word " + s + " contains " + count + " vowels;");
        }
        System.out.println("Total vowel count = " + globalCount);
        System.out.println(hashMap);
    }
}
