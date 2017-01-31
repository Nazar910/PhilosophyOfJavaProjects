package chapter8.upcasting;

/**
 * Created by pyvov on 30.12.2016.
 */
public class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Unicycle.ride()");
    }

    public void balance() {
        System.out.println("Unicycle.balance()");
    }
}
