package chapter17.ex3;

import chapter17.containers.Countries;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nazar on 09/02/17.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Countries.names());
        System.out.println(set);
        set.add("qwerty");
        System.out.println(set);
        set.addAll(Countries.names());
        System.out.println(set);
    }
}
