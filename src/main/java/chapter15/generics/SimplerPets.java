package chapter15.generics;

import chapter14.typeinfo.pets.Person;
import chapter14.typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

/**
 * Created by nazar on 01/02/17.
 */
public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
    }
}
