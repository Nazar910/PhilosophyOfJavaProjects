package chapter14.typeinfo.pets;

/**
 * Created by pyvov on 21.01.2017.
 */
public class Individual {
    private String name;

    public Individual() {
    }

    public Individual(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
