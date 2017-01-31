package chapter14.ex8;

/**
 * Created by pyvov on 18.01.2017.
 */
class A {}
class B extends A {}
class C extends B{}
class D extends C {}
public class Main {
    static void getSuperClass(Class<?> c) {
        Class<?> superclass = c.getSuperclass();
        if (superclass != null) {
            System.out.println(String.format("Superclass of %s is %s",c.getSimpleName(),superclass.getSimpleName()));
            getSuperClass(superclass);
        }
    }

    public static void main(String[] args) {
        try {
            getSuperClass(Class.forName("chapter14.ex8.D"));
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
