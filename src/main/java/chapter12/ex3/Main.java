package chapter12.ex3;

/**
 * Created by pyvov on 14.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: ");
            e.printStackTrace();
        }
    }
}
