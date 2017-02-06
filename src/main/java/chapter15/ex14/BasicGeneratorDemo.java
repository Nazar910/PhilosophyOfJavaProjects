package chapter15.ex14;

import chapter15.generics.BasicGenerator;
import chapter15.generics.CountedObject;
import chapter15.generics.Generator;

/**
 * Created by nazar on 01/02/17.
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen =
                BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
