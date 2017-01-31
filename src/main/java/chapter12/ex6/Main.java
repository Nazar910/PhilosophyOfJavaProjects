package chapter12.ex6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by pyvov on 14.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception1();
        } catch (Exception1 exception1) {
            System.err.println("Caught " + exception1);
        }

        try {
            throw new Exception2();
        } catch (Exception2 exception2) {
            System.err.println("Caught " + exception2);
        }
    }
}

class Exception1 extends Exception {
    private static Logger logger = Logger.getLogger("Exception1");

    public Exception1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class Exception2 extends Exception {
    private static Logger logger = Logger.getLogger("Exception2");

    public Exception2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}