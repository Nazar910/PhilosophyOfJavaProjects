package chapter17.ex33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nazar on 14/02/17.
 */
public class FastTraversalLinkedList<T> {
    private List<T> list;

    public FastTraversalLinkedList() {
        prepareToAddRemove();
    }

    public void prepareToAddRemove() {
        if (list == null) {
            list = new LinkedList<T>();
        } else {
            list = new LinkedList<T>(list);
        }
    }

    public void prepareToGet() {
        list = new ArrayList<T>(list);
    }

    public T get(int i) {
        return list.get(i);
    }

    public boolean add(T item) {
        list.add(item);
        return true;
    }

    public boolean remove(T item) {
        list.remove(item);
        return true;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        FastTraversalLinkedList<Integer> list = new FastTraversalLinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.prepareToGet();
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}
