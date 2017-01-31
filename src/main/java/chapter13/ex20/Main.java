package chapter13.ex20;


import java.util.Scanner;

/**
 * Created by pyvov on 17.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        String str = "1\n2\n3,2\n5,6\nqwerty\n";
        Scanner sc = new Scanner(str);
        int i = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        String s = sc.next();
        System.out.println(new A(i, l, f, d, s));
    }
}

class A {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;

    public A(int i, long l, float f, double d, String s) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
        this.s = s;
    }

    @Override
    public String toString() {
        return String.format("int = %d long = %d\n" +
                "float = %f double = %f\n" +
                "String = %s", i, l, f, d, s);
    }
}
