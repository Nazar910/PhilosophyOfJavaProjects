package chapter13.ex7;

/**
 * Created by pyvov on 15.01.2017.
 */
public class Main {
    public static boolean isMatches(String s) {
        return s.matches("\\p{Upper}\\w*+.$");
    }

    public static void main(String[] args) {
        System.out.println(isMatches("Aasfdsgfsgseg."));
    }
}
