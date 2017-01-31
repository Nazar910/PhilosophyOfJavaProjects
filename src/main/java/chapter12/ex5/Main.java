package chapter12.ex5;

/**
 * Created by pyvov on 14.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[5];
        int index = 10;
        while (true) {
            try {
                a[index] = 10;
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds: " + index);
                index--;
            }
        }
        System.out.println("Done, index = " + index);
    }
}
