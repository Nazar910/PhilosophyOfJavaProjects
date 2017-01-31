package chapter11.ex32;

import chapter11.holding.InterfaceVsIterator;
import chapter11.holding.Pet;

import java.util.*;

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

public class NonCollectionSequence extends PetSequence
implements Iterable<Pet>{
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
    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int index = pets.length - 1;
                    public boolean hasNext() {
                        return index > -1;
                    }

                    public Pet next() {
                        return pets[index--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        for (Pet p : nc) {
            System.out.print(p + " ");
        }
        System.out.println();
        for (Pet p : nc.reversed()) {
            System.out.print(p + " ");
        }
        System.out.println();
        for (Pet p : nc.randomized()) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
