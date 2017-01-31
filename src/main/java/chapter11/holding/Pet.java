package chapter11.holding;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Pet {
    private int id;

    public Pet(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pet-"+this.id;
    }
}
