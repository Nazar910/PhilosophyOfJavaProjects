package chapter14.ex9;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by pyvov on 18.01.2017.
 */
class A {
    private int a;
    public int b;
}

class B extends A {
}

class C extends B {
}

class D extends C {
    public String s;
}

public class Main {
    static void getSuperClass(Object obj) {
        Class<?> superclass = obj.getClass().getSuperclass();
        if (superclass != null) {
            System.out.format("Declared fields of %s are:\n", obj);
            System.out.println(Arrays.asList(obj.getClass().getDeclaredFields()));
            System.out.println(String.format("Superclass of %s is %s", obj.getClass().getSimpleName(), superclass.getSimpleName()));
            try {
                getSuperClass(superclass.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        getSuperClass(new D());
    }
}
