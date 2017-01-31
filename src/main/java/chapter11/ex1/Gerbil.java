package chapter11.ex1;

import java.util.ArrayList;

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
        System.out.println(list.get(0).hop());
        for (Gerbil g : list) {
            System.out.print(g.hop() + " ");
        }
    }
}
