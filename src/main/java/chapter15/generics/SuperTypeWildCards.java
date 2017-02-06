package chapter15.generics;

import java.util.List;

/**
 * Created by nazar on 03/02/17.
 */
public class SuperTypeWildCards {
    static void write(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Johnathan());
//        apples.add(new Fruit());
    }
}
