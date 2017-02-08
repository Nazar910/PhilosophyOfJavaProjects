package chapter16.ex20;

import java.util.Arrays;

/**
 * Created by nazar on 08/02/17.
 */
public class DeepEqualsExample {
    public static void main(String[] args) {
        int[][][] ar1 = new int[4][4][4];
        int[][][] ar2 = new int[4][4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    ar1[i][j][k] = 1;
                    ar2[i][j][k] = 1;
                }
            }
        }
        System.out.println(Arrays.deepEquals(ar1,ar2));
    }
}
