package chapter15.ex4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyvov on 11.01.2017.
 */
interface Selector<T> {
    boolean end();

    T current();

    void next();
}

public class Sequence<T> {
    private List<T> items;
    private int next = 0;

    public Sequence() {
        items = new ArrayList<T>();
    }

    public void add(T x) {
            items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.size();
        }

        public T current() {
            return items.get(i);
        }

        public void next() {
            if (i < items.size()) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence<Integer> sequence = new Sequence<Integer>();
        for (int i = 0; i < 10; i++) {
            sequence.add(new Integer(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }


}
