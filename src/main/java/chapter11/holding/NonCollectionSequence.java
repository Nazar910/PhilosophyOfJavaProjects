package chapter11.holding;

import java.util.Iterator;

/**
 * Created by pyvov on 13.01.2017.
 */
class PetSequence {
    protected Pet[]  pets = {
            new Pet(1),
            new Pet(2),
            new Pet(3),
            new Pet(4),
            new Pet(5),
            new Pet(6),
            new Pet(7),
            new Pet(8)
    };
}
public class NonCollectionSequence extends PetSequence{
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
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}
