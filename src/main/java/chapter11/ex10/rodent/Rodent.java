package chapter11.ex10.rodent;

/**
 * Created by pyvov on 30.12.2016.
 */
public class Rodent {
    public void bite() {
    }

    public void run() {
    }

    public Rodent() {
        System.out.println("Rodent constructor");
    }
    protected void dispose() {
        System.out.println("Rodent.dispose()");
    }

    @Override
    public String toString() {
        return "Rodent ";
    }
}
