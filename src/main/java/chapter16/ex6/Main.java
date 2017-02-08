package chapter16.ex6;

import chapter16.arrays.BerylliumSphere;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by nazar on 07/02/17.
 */
public class Main {
    static BerylliumSphere[][] f(int ni, int nj) {
        BerylliumSphere[][] results = new BerylliumSphere[ni][nj];
        for (int i = 0; i < ni; i++) {
            for (int j = 0; j < nj; j++) {
                results[i][j] = new BerylliumSphere();
            }
        }
        return results;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(f(2,2)));
    }
}
