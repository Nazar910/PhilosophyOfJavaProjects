package chapter13.ex11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pyvov on 15.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        String s = "Airline ate eight apples and one orange while Anita hadn't any";
        Pattern pattern = Pattern.compile("(?i)(($[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
    }
}
