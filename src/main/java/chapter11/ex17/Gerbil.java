package chapter11.ex17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by pyvov on 11.01.2017.
 */
public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public String hop() {
        return "Gerbil-" + this.gerbilNumber + ";";
    }

    public static void main(String[] args) {
        HashMap<String, Gerbil> hashMap = new HashMap<String, Gerbil>();
        hashMap.put("Jack", new Gerbil(0));
        hashMap.put("Mike", new Gerbil(1));
        hashMap.put("Mary", new Gerbil(2));
        hashMap.put("Alice", new Gerbil(3));
        hashMap.put("Kristina", new Gerbil(4));
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print("Key = " + s + ", Value = " + hashMap.get(s).hop() + '\n');
        }
    }
}
