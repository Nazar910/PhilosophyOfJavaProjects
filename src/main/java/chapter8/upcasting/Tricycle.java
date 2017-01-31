package chapter8.upcasting;

/**
 * Created by pyvov on 30.12.2016.
 */
public class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle.ride()");
    }

    public static void main(String[] args) {
        Cycle[] cycles = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        cycles[0].ride();
//        cycles[0].balance();
        ((Unicycle)cycles[0]).balance();
        cycles[1].ride();
//        cycles[1].balance();
        ((Bicycle)cycles[1]).balance();
        cycles[2].ride();
//        ((Bicycle)cycles[2]).balance();
//        new Cycle().ride();
//        new Unicycle().ride();
//        new Bicycle().ride();
//        new Tricycle().ride();
//        Cycle cycle = new Bicycle();
//        cycle.ride();
    }
}
