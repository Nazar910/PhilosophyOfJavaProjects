package chapter16.ex7;

import chapter16.arrays.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by nazar on 07/02/17.
 */
public class Main {
    static BerylliumSphere[][][] f(int ni, int nj, int nk) {
        BerylliumSphere[][][] results = new BerylliumSphere[ni][nj][nk];
        for (int i = 0; i < ni; i++) {
            for (int j = 0; j < nj; j++) {
                for (int k = 0; k < nk; k++) {
                    results[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return results;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(f(2,2, 2)));
    }
}
