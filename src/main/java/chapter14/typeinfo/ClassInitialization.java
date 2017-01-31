package chapter14.typeinfo;

import java.util.Random;

/**
 * Created by pyvov on 19.01.2017.
 */
class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Init of Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Init of Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Init of Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        //don't runs init process
        System.out.println(Initable.staticFinal);
        //runs init process
        System.out.println(Initable.staticFinal2);
        //runs init process
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("chapter14.typeinfo.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
