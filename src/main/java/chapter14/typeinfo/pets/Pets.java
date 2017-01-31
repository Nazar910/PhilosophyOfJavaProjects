package chapter14.typeinfo.pets;

import chapter14.ex15.RegisteredPetsCreator;

import java.util.ArrayList;

/**
 * Created by pyvov on 21.01.2017.
 */
public class Pets {
    public static final PetCreator creator = new RegisteredPetsCreator();

    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
