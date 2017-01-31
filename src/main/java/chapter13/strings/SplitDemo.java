package chapter13.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by pyvov on 17.01.2017.
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input =
                "This!!unsusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        //Only do the first three:
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));
    }
}
