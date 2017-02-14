package chapter17.ex2;

import chapter17.containers.Countries;

import java.util.stream.Collectors;

/**
 * Created by nazar on 09/02/17.
 */
public class BeginsWithA {
    public static void main(String[] args) {
        System.out.println("Before filter: " + Countries.capitals());
        System.out.println("After: " + Countries.capitals().keySet()
                .stream().filter(a -> a.startsWith("A")).collect(Collectors.toList()));
    }
}
