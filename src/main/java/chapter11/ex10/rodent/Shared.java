package chapter11.ex10.rodent;

/**
 * Created by pyvov on 02.01.2017.
 */
public class Shared {
    private static long counter = 0;
    private final long id = counter++;
    private long refCount = 0;

    public void addRef() {
        refCount++;
    }

    protected void dispose() {
        if(--refCount == 0) {
            System.out.println("Disposing "+this);
        }
    }

    @Override
    public String toString() {
        return "Shared "+id;
    }
}
