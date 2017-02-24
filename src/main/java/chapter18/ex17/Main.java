package chapter18.ex17;

import chapter18.io.TextFile;

import java.util.HashMap;

/**
 * Created by pyvov on 20.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (String s : new TextFile("src/main/java/chapter18/ex17/test.txt")) {
            for (char c : s.toCharArray()) {
                Integer i = hashMap.get(c);
                hashMap.put(c, i != null ? i + 1 : 1);
            }
        }
        System.out.println(hashMap);
    }
}
