package chapter1.Operators;

/**
 * Created by pyvov on 04.10.2016.
 */
class Letter{
    char c;
}
public class PassObject {
    static void f(Letter y){
        y.c='z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: "+x.c);
        f(x);
        System.out.println("2: x.c: "+x.c);
    }
}
