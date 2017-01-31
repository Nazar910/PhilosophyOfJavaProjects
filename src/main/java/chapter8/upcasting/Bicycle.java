package chapter8.upcasting;

/**
 * Created by pyvov on 30.12.2016.
 */
public class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Bicycle.ride()");
    }

    public void balance() {
        System.out.println("Bicycle.balance()");
    }
}
