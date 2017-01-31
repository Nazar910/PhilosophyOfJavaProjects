package chapter11.holding;

import java.util.*;

/**
 * Created by pyvov on 13.01.2017.
 */
public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet p : pets) {
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petList = new ArrayList<Pet>(Arrays.asList(
                new Pet(1),
                new Pet(2),
                new Pet(3),
                new Pet(4),
                new Pet(5),
                new Pet(6),
                new Pet(7),
                new Pet(8)
        ));
        Set<Pet> petSet = new HashSet<Pet>(petList);
        Map<String, Pet> petMap =
                new HashMap<String, Pet>();
        String[] names = ("Ralph, Eric, Robin, Lacey, Britney, Sam, Spot, Fluffy").split(", ");
        for (int i=0; i<names.length; i++ ) {
            petMap.put(names[i], petList.get(i));
        }
        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());
        System.out.println(petMap);
        System.out.println(petMap.keySet());
        display(petMap.values());
        display(petMap.values().iterator());
    }
}
