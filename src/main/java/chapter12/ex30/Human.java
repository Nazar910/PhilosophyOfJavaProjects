package chapter12.ex30;

import java.util.Random;

/**
 * Created by pyvov on 14.01.2017.
 */
class Annoyance extends RuntimeException {}

class Sneeze extends Annoyance {}

public class Human {
    private static Random rand = new Random(47);
    private static void throwRandomException() {
        switch (rand.nextInt(2)) {
            case 0: throw new Annoyance();
            case 1: throw new Sneeze();
        }
    }
    public static void main(String[] args) {
        try {
            throwRandomException();
        } catch (RuntimeException re) {
            try {
                throw re;
            } catch (Sneeze e) {
                System.out.println("Caught Sneeze: " + e);
            } catch (Annoyance e) {
                System.out.println("Caught Annoyance: " + e);
            }
        }

    }
}
