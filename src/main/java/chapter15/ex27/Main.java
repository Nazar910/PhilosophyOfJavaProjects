package chapter15.ex27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nazar on 03/02/17.
 */
public class Main {
    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers.get(0));
    }
}
