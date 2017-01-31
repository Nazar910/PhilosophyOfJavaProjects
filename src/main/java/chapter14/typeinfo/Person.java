package chapter14.typeinfo;

/**
 * Created by pyvov on 26.01.2017.
 */
public class Person {
    public final String first;
    public final String last;
    public final String address;

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Person: %s %s %s", first, last, address);
    }

    public static class NullPerson extends Person implements Null {
        private NullPerson() { super("None", "None", "None"); }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}
