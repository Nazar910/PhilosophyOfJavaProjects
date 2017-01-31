package chapter14.ex15;

import chapter14.typeinfo.pets.*;
import chapter14.typeinfo.pets.Hamster;
import chapter14.typeinfo.pets.factory.Factory;
import chapter8.rodent.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by pyvov on 21.01.2017.
 */
public class RegisteredPetsCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();

    static {
        types.add(Cat.class);
        types.add(Dog.class);
        types.add(Cymric.class);
        types.add(EgyptianMau.class);
        types.add(Hamster.class);
        types.add(Rat.class);
        types.add(Manx.class);
        types.add(Mutt.class);
        types.add(Pug.class);
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
}
