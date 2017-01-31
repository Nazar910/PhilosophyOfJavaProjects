package chapter14.ex7;

/**
 * Created by pyvov on 17.01.2017.
 */
class Candy {
    static {
        System.out.println("Loading class Candy");
    }

    public Candy() {
        System.out.println("Created new obj Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading class Gum");
    }

    public Gum() {
        System.out.println("Created new obj Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading class Cookie");
    }

    public Cookie() {
        System.out.println("Created new obj Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("Program started ...");
        for (String arg : args) {
            try {
                Class c = Class.forName(arg);
                c.newInstance();
            } catch (ClassNotFoundException e) {
                System.out.println(String.format("Class %s not found",arg));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
