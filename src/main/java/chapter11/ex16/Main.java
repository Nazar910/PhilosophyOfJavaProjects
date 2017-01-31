package chapter11.ex16;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        String str = "A E I O U Y";
        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(str.split(" ")));
        hashSet.addAll(new HashSet<String>(Arrays.asList(str.toLowerCase().split(" "))));
        String[] words = {"A", "add", "addAll", "args", "B", "C", "class"};
        int globalCount = 0;
        for (String s : words) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (hashSet.contains(Character.toString(c))) {
                    count++;
                    globalCount++;
                }
            }
            System.out.println("Word " + s + " contains " + count + " vowels;");
        }
        System.out.println("Total vowel count = " + globalCount);
    }
}
