package chapter17.ex10;

import chapter17.containers.Pair;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by nazar on 12/02/17.
 */
public class SortedSetSample<T extends Comparable<T>> extends LinkedList<T> {
    @Override
    public boolean add(T t) {
        return this.indexOf(t) == -1 && super.add(t) && sort();
    }

    public SortedSetSample() {}

    public SortedSetSample(Collection<T> collection) {
        this.addAll(collection);
        this.sort();
    }

    private boolean sort() {
        Collections.sort(this);
        return true;
    }

    public SortedSetSample<T> tailSet(T fromElement) {
        return this.subSet(fromElement, get(this.size()-1));
    }

    public SortedSetSample<T> headSet(T toElement) {
        return this.subSet(get(0), toElement);
    }

    public SortedSetSample<T> subSet(T fromElement, T toElement) {
        return new SortedSetSample<T>(this.subList(this.indexOf(fromElement), this.indexOf(toElement)));
    }

    public static void main(String[] args) {
        SortedSetSample<Integer> set = new SortedSetSample<>();
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(10);
        set.add(5);
        set.add(4);
        System.out.println(set);
        System.out.println(set.subSet(2,3));
        System.out.println(set.getFirst());
        System.out.println(set.getLast());
        System.out.println(set.headSet(5));
        System.out.println(set.tailSet(3));
    }
}
