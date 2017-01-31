package chapter11.ex10.rodent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by pyvov on 30.12.2016.
 */
public class Mouse extends Rodent {
//    private Hamster hamster = new Hamster();
    private Shared shared;
    @Override
    public void bite() {
        System.out.println("Mouse.bite()");
    }

    @Override
    public void run() {
        System.out.println("Mouse.run()");
    }

    public void compose(Shared shared) {
        this.shared = shared;
        this.shared.addRef();
    }

    public Mouse() {
        System.out.println("Mouse constructor");
    }
    protected void dispose() {
        System.out.println("Mouse.dispose()");
        this.shared.dispose();
        super.dispose();
    }

    @Override
    public String toString() {
        return "Mouse ";
    }

    public static void main(String[] args) {
        ArrayList<Rodent> list = new ArrayList<Rodent>();
        list.add(new Mouse());
        list.add(new Hamster());
        list.add(new Rodent());
        Iterator<Rodent> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
