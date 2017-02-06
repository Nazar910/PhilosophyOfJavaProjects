package chapter15.ex1;

import chapter14.typeinfo.pets.Hamster;
import chapter14.typeinfo.pets.Pet;
import chapter15.generics.Holder3;

/**
 * Created by nazar on 31/01/17.
 */
public class Main {
    public static void main(String[] args) {
        Holder3<Pet> h3 = new Holder3<Pet>(new Pet());
        Pet p = h3.get();
    }
}
