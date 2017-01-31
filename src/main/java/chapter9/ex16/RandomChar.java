package chapter9.ex16;

import java.util.Random;

/**
 * Created by pyvov on 08.01.2017.
 */
public class RandomChar {
    private static Random rand = new Random(60);

    public char nextChar() {
        return (char) rand.nextInt();
    }

    public static void main(String[] args) {
        RandomChar rc = new RandomChar();
        for(int i = 0; i<4; i++) {
            System.out.print(rc.nextChar());
        }
    }
}
