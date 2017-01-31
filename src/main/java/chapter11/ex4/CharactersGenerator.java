package chapter11.ex4;

/**
 * Created by pyvov on 12.01.2017.
 */
public class CharactersGenerator {
    private static String[] characters = { "Vincent" ,"Jules", "Butch", "Wallace" };
    private static int i = 0;
    public static String next() {
        if (i >= characters.length) {
            i = 0;
        }
        return characters[i++];
    }
    public static int arrayLength() {
        return characters.length;
    }
}
