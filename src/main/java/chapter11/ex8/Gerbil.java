package chapter11.ex8;

import java.util.ArrayList;
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
        return "Gerbil number = " + this.gerbilNumber + ";";
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> list = new ArrayList<Gerbil>();
        list.add(new Gerbil(0));
        list.add(new Gerbil(1));
        list.add(new Gerbil(2));
        list.add(new Gerbil(3));
        list.add(new Gerbil(4));
        Iterator<Gerbil> iterator = list.iterator();
        for ( ; iterator.hasNext() ; ) {
            System.out.print(iterator.next().hop() + " ");
        }
    }
}
