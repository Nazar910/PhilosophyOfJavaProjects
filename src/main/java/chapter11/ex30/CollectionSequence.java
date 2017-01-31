package chapter11.ex30;

import chapter11.holding.InterfaceVsIterator;
import chapter11.holding.Pet;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by pyvov on 13.01.2017.
 */
public class CollectionSequence implements Collection<Pet> {
    private Pet[] pets = {
            new Pet(1),
            new Pet(2),
            new Pet(3),
            new Pet(4),
            new Pet(5),
            new Pet(6),
            new Pet(7),
            new Pet(8)
    };

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(Object o) {
        for (Pet p : pets) {
            if (p.equals(o)) return true;
        }
        return false;
    }

    public Object[] toArray() {
        return pets;
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean add(Pet pet) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends Pet> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    public int size() {
        return pets.length;
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
    }
}
