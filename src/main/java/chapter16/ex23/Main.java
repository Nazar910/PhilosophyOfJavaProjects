package chapter16.ex23;

import java.util.Arrays;

/**
 * Created by nazar on 08/02/17.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        Arrays.sort(a, (a1, a2) -> a1 > a2 ? -1 : (a1.equals(a2) ? 0 : 1));
        System.out.println(Arrays.toString(a));
    }
}
