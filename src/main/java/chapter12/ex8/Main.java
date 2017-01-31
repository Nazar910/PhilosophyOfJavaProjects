package chapter12.ex8;

import chapter12.ex4.MyException;

/**
 * Created by pyvov on 14.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            print();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static void print() throws MyException {
        throw new MyException("print()");
    }
}
