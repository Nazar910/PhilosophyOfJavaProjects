package chapter9.ex17;

/**
 * Created by pyvov on 08.01.2017.
 */
interface I {
    int a = 1;
}
public class Main {
    public static void main(String[] args) {
        System.out.println(I.a);
//        I.a = 2;     cannot assign value to a variable a
    }
}
