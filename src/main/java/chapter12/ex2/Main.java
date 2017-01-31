package chapter12.ex2;

/**
 * Created by pyvov on 14.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Integer i = null;
            i.byteValue();
        } catch (NullPointerException e) {
            System.out.println("Caught exception: ");
            e.printStackTrace();
        }
    }
}
