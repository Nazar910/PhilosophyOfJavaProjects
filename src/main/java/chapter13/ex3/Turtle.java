package chapter13.ex3;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by pyvov on 15.01.2017.
 */
public class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.err));
        Turtle terry = new Turtle("Terr", new Formatter(outAlias));

        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(3,4);
        terry.move(2,5);
        tommy.move(3,3);
        terry.move(3,3);
    }
}
