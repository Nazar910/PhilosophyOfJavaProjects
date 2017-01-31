package chapter11.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pyvov on 12.01.2017.
 */
public class ListFeatures {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        System.out.println("1:" + numbers);
        Integer i = 7;
        numbers.add(i);
        System.out.println("2:" + numbers);
        System.out.println("3:" + numbers.contains(i));
        numbers.remove(i);
        i = numbers.get(2);
        System.out.println("4:" + i + " " + numbers.indexOf(i));
    }
}
