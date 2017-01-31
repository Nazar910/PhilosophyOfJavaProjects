package chapter9.rodent;

/**
 * Created by pyvov on 30.12.2016.
 */
public abstract class Rodent {
    public abstract void bite();

    public abstract void run();


    public Rodent() {
        System.out.println("Rodent constructor");
    }
    protected void dispose() {
        System.out.println("Rodent.dispose()");
    }
}
