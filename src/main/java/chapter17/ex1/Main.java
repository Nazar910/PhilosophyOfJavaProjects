package chapter17.ex1;

import chapter17.containers.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nazar on 09/02/17.
 */
public class Main {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(Countries.names());
        System.out.println(countries);
        Collections.shuffle(countries);
        System.out.println(countries);
        Collections.shuffle(countries);
        System.out.println(countries);
    }
}
