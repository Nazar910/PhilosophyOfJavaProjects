package chapter13.ex12;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pyvov on 15.01.2017.
 */
public class Groups {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the botogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\b[a-z]\\w+")
                .matcher(POEM);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        while (m.find()) {
            Integer i = hashMap.get(m.group());
            hashMap.put(m.group(), i == null ? 1 : i + 1);
        }
        for (String s : hashMap.keySet()) {
            System.out.println("word: " + s + ", count: " + hashMap.get(s));
        }
    }
}
