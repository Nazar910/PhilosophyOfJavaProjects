package chapter14.ex20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Created by pyvov on 23.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter name of class to analyze ...");
            System.exit(1);
        } else if (args.length > 1) {
            System.out.println("Too many classes was entered. Please select only one.");
            System.exit(1);
        }
        Pattern p = Pattern.compile("\\w+\\.");
        try {
            Class<?> c = Class.forName(args[0]);
            System.out.println("Class full name is: " + c.getName());
            System.out.println("Class name is: " + c.getSimpleName());
            Class<?>[] interfaces = c.getInterfaces();
            if (interfaces == null) {
                System.out.println("There is no interfaces implemented by this class.");
            } else {
                System.out.println("Interfaces: ");
                for (Class buf : interfaces) {
                    System.out.println("\t" + buf.getName());
                }
            }
            Method[] methods = c.getMethods();
            if (methods == null) {
                System.out.println("There is no methods in this class.");
            } else {
                System.out.println("Methods:");
                for (Method method : methods) {
                    System.out.println("\t" + p.matcher(method.toString()).replaceAll(""));
                }
            }
            Constructor[] constructors = c.getConstructors();
            if (constructors == null) {
                System.out.println("Object of this class must not be created or must be created by his method");
            } else {
                System.out.println("Constructors:");
                for (Constructor constructor : constructors) {
                    System.out.println("\t" + p.matcher(constructor.toString()).replaceAll(""));
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            System.exit(1);
        }
    }
}
