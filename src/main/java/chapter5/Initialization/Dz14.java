package chapter5.Initialization;

/**
 * Created by pyvov on 20.10.2016.
 */
public class Dz14 {
    static String s1 = "default";
    static String s2;
    static{
        s2 = "statics init";
    }
    static void print(){
        System.out.println("s1 = "+s1+"; s2 = "+s2);
    }

    public static void main(String[] args) {
        print();
    }
}
