package chapter14.ex2;

/**
 * Created by pyvov on 18.01.2017.
 */
interface HasBatteries {}

interface Waterproof {}

interface Shoots {}

interface Sounds {}

class Toy {
    public Toy() {}
    public Toy(int i) {}
}

class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots, Sounds {
    public FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
            " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("chapter14.ex2.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            //default constructor is required
            obj = up.newInstance();
        } catch (IllegalAccessException e) {
            System.out.println("Can't create an object");
            System.exit(1);
        } catch (InstantiationException e) {
            System.out.println("Access denied");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
