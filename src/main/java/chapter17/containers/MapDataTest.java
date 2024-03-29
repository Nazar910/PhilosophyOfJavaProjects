package chapter17.containers;

import chapter15.generics.Generator;
import chapter16.arrays.CountringGenerator;

import java.util.Iterator;

/**
 * Created by nazar on 08/02/17.
 */
class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<Integer,String>(
                number++,""+letter++
        );
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }

            @Override
            public Integer next() {
                return number++;
            }
        };
    }
}

public class MapDataTest {
    public static void main(String[] args) {
        System.out.println(MapData.map(new Letters(), 11));
        System.out.println(MapData.map(new CountringGenerator.Character(),
                new CountringGenerator.String(3), 8));
        System.out.println(MapData.map(new CountringGenerator.Character(),
                "Value", 6));
        System.out.println(MapData.map(new Letters(), new CountringGenerator.String(3)));
        System.out.println(MapData.map(new Letters(), "Pop"));
    }
}

















