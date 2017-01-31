package chapter9.rodent;

/**
 * Created by pyvov on 30.12.2016.
 */
public class Hamster extends Rodent {
    @Override
    public void bite() {
        System.out.println("Hamster.bite()");
    }

    @Override
    public void run() {
        System.out.println("Hamster.run()");
    }

    public Hamster() {
        System.out.println("Hamster constructor");
    }
}
