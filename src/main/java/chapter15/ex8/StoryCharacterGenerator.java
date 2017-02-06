package chapter15.ex8;

import chapter15.generics.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by nazar on 01/02/17.
 */
public class StoryCharacterGenerator implements Generator<StoryCharacters>,
        Iterable<StoryCharacters> {
    private Class[] types = {DartVaider.class, Luke.class, Palpatyn.class, Yoda.class};
    private Random rand = new Random(47);

    public StoryCharacters next() {
        try {
            return (StoryCharacters) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private int size;

    public StoryCharacterGenerator(int size) {
        this.size = size;
    }

    public Iterator<StoryCharacters> iterator() {
        return new Iterator<StoryCharacters>() {
            private int count = size;

            public boolean hasNext() {
                return count > 0;
            }

            public StoryCharacters next() {
                count--;
                return StoryCharacterGenerator.this.next();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (StoryCharacters character : new StoryCharacterGenerator(18)) {
            System.out.print(character + " ");
        }
    }
}
