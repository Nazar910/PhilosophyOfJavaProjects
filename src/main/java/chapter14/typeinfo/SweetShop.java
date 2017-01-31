package chapter14.typeinfo;

/**
 * Created by pyvov on 17.01.2017.
 */
class Candy {
    static {
        System.out.println("Loading class Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading class Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading class Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("In main method");
        new Candy();
        System.out.println("After creating Candy object");
        try {
            Class.forName("chapter14.typeinfo.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Gum not found");
        }
        System.out.println("After calling Class.forName(\"Gum\") method");
        new Cookie();
        System.out.println("After creating Cookie object");
    }
}
