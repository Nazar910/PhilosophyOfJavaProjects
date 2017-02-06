package chapter15.generics;


import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nazar on 31/01/17.
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for (String s : "The quick brown fox jump over the lazy brown dog".split(" ")) {
            rs.add(s);
        }
        RandomList<Integer> ri = new RandomList<Integer>();
        for (int i = 0; i<11; i++) {
            ri.add(i);
            System.out.print(rs.select() + " ");
        }
        RandomList<Character> rc = new RandomList<Character>();
        System.out.println();
        for (char c : "qwerty123".toCharArray()) {
            rc.add(c);
        }
        for (int i = 0; i<11; i++) {
            System.out.print(ri.select() + "~" + rc.select() + " ");
        }
    }
}
