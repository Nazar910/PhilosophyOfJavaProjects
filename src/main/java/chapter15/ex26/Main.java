package chapter15.ex26;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazar on 03/02/17.
 */
public class Main {
    public static void main(String[] args) {
        Number[] numbers = new Integer[10];
        numbers[0] = 1;
        try {
            numbers[1] = new Number() {
                @Override
                public int intValue() {
                    return 0;
                }

                @Override
                public long longValue() {
                    return 0;
                }

                @Override
                public float floatValue() {
                    return 0;
                }

                @Override
                public double doubleValue() {
                    return 0;
                }
            };
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
