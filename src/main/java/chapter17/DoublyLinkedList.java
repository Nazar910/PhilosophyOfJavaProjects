package chapter17;

/**
 * Created by nazar on 12/02/17.
 */
class ListElement<T> {
    ListElement<T> next;
    ListElement<T> previous;
    T data;

    @Override
    public String toString() {
        return data != null ? data.toString() : "";
    }
}

interface DoublyLinkedListIterator<T> {
    void add(T item);

    void remove();

    T next();

    boolean hasNext();
}

public class DoublyLinkedList<T> {
    private ListElement<T> head = new ListElement<T>();
    private ListElement<T> current = head;
    private int size;

    public void add(T item) {
        if (head.data == null) {
            current.data = item;
        } else {
            current.next = new ListElement<T>();
            current.next.data = item;
            current.next.previous = current;
            current = current.next;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public DoublyLinkedListIterator<T> iterator() {
        return new DoublyLinkedListIterator<T>() {
            {
                current = head;
            }

            @Override
            public void add(T item) {
                ListElement<T> next = current.next != null ? current.next : current;
                current.next = new ListElement<T>();
                current.next.data = item;
                next.previous = current.next;
                current.next.next = next;
                current = current.next;
            }

            @Override
            public void remove() {
                ListElement<T> next = current.next != null ? current.next : current;
                current.previous.next = next;
                next.previous = current.previous;
            }

            @Override
            public T next() {
                ListElement<T> element = current;
                current = current.next;
                return element.data;
            }

            @Override
            public boolean hasNext() {
                return current != null && size != 0;
            }
        };
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
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        DoublyLinkedListIterator<Integer> it = list.iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) {
            it.add(i);
            System.out.println(list);
        }

        it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == 4) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
