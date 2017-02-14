package chapter17.ex8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nazar on 11/02/17.
 */
class ListElement<T> {
    ListElement<T> next;
    T data;

    @Override
    public String toString() {
        return data != null ? data.toString() : "";
    }
}

class SListIterator<T> {
    private ListElement<T> head;
    private ListElement<T> current;

    public SListIterator(ListElement<T> head, ListElement<T> current) {
        this.head = head;
        this.current = current;
    }

    public void add(T item) {
        if (head.data == null) {
            current.data = item;
        } else {
            current.next = new ListElement<T>();
            current.next.data = item;
            current = current.next;
        }
    }

    public void delete() {
        ListElement<T> element = head;
        if (element.next == null) {
            head.data = null;
            return;
        }
        while(element.next != current) {
            element = element.next;
        }
        element.next = current.next;
        current = element;
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        ListElement<T> result = current;
        current = current.next;
        return result.data;
    }

    public void reset() {
        current = head;
    }
}

public class SList<T> {
    private ListElement<T> current = new ListElement<T>();
    private ListElement<T> head = current;


    public SListIterator<T> iterator() {
        return new SListIterator<T>(head, current);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        ListElement<T> var = head;
        if (var != null) {
            s.append(var);
            var = var.next;
        }
        while (var != null) {
            s.append(", ");
            s.append(var);
            var = var.next;
        }
        s.append("]");
        return s.toString();
    }

    public static void main(String[] args) {
        SList<Integer> sList = new SList<>();
        SListIterator<Integer> it = sList.iterator();
        it.add(1);
        it.add(2);
        it.add(3);

        it.reset();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        /*System.out.println(sList);
        it.delete();
        System.out.println(sList);
        it.delete();
        System.out.println(sList);
        it.delete();
        System.out.println(sList);*/
    }
}
