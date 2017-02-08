package chapter16.arrays;

/**
 * Created by nazar on 08/02/17.
 */
public class ConvertTo {
    public static int[] primitive(Integer[] in) {
        int[] ar = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            ar[i] = in[i];
        }
        return ar;
    }
}
