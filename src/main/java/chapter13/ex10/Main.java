package chapter13.ex10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pyvov on 15.01.2017.
 */
public class Main {
    private static String s = "Java now has regular expression";
    public static void main(String[] args) {
        System.out.println(Pattern.compile("^Java").matcher(s).matches());
        System.out.println(Pattern.compile("\\Breg.*").matcher(s).matches());
        System.out.println(Pattern.compile("n.w\\s+h(a|i)s").matcher(s).matches());
        System.out.println(Pattern.compile("s?").matcher(s).matches());
        System.out.println(Pattern.compile("s*").matcher(s).matches());
        System.out.println(Pattern.compile("s+").matcher(s).matches());
        System.out.println(Pattern.compile("s{4}").matcher(s).matches());
        System.out.println(Pattern.compile("s{1}").matcher(s).matches());
        System.out.println(Pattern.compile("s{0,3}").matcher(s).matches());
    }
}
