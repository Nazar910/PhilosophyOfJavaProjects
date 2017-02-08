package chapter16.ex4;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by nazar on 07/02/17.
 */
public class Main {
    private Random rand = new Random(47);

    double[][][] doubleArray(int ni, int nj,int nk, double from, double to) {
        double[][][] result = new double[ni][nj][nk];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < result[i][j].length; k++) {
                    result[i][j][k] = rand.nextDouble() * to + from;
                }
            }
        }
        return result;
    }

    void printArray(int ni, int nj, int nk, double from, double to) {
        System.out.println(Arrays.deepToString(doubleArray(ni, nj, nk, from, to)));
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.printArray(5,5, 3,1,10);
    }
}
