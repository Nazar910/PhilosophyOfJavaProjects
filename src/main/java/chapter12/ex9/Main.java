package chapter12.ex9;

import java.util.Random;

/**
 * Created by pyvov on 14.01.2017.
 */
public class Main {
    private static Random rand = new Random(47);
    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            try {
                getRandomException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void getRandomException() throws Exception1, Exception2, Exception3 {
        switch (rand.nextInt(3)) {
            case 0: throw new Exception1();
            case 1: throw new Exception2();
            case 2: throw new Exception3();
        }
    }
}

class Exception1 extends Exception {}
class Exception2 extends Exception {}
class Exception3 extends Exception {}
