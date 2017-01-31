package chapter5.Initialization;

/**
 * Created by pyvov on 20.10.2016.
 */
public class Dz15 {
    private String s;
    {
        s="object";
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Dz15 d = new Dz15();
        System.out.println(d);
    }
}
