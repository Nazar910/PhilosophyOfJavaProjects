package chapter1.Operators;

/**
 * Created by pyvov on 13.10.2016.
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = "+big);
        int bigger = big +1;
        System.out.println("much bigger = "+bigger);
    }
}
