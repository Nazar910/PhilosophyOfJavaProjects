package chapter18.io;

import java.io.PrintWriter;
import java.io.SyncFailedException;

/**
 * Created by pyvov on 20.02.2017.
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello, world!");
    }
}
