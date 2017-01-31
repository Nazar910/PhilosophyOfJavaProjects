package chapter1.Operators;

/**
 * Created by pyvov on 18.10.2016.
 */
public class Literals {
    public static void main(String[] args) {
        int i1= 0x2f; //Шестнадцатеричное( нижний регистр )
        System.out.println("i1: "+Integer.toBinaryString(i1));
        int i2 = 0x2F; //Шестнадцатеричное (верхний регистр)
        System.out.println("i2: "+Integer.toBinaryString(i2));
        int i3 = 0177; //Восьмеричное (начинается с нуля)
        System.out.println("i3: "+Integer.toBinaryString(i3));
        char c = 0xffff; // макс. шестнадцатеричное знач. char
        System.out.println("c: "+Integer.toBinaryString(c));
        byte b = 0x7f; // макс. шестнадцатеричное знач. byte
        System.out.println("b: "+Integer.toBinaryString(b));
        short s = 0x7fff; // макс. шестнадцатеричное знач. short
        System.out.println("s: "+Integer.toBinaryString(s));
        long n1 = 200L;// Суффикс, обозначающий long
        long n2 = 200l;// Суффикс, обозначающий long
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F;//Суффикс, обозначающий float
        float f3 = 1f;//Суффикс, обозначающий float
        double d1 = 1d;//Суффикс, обозначающий double
        double d2 = 1D;//Суффикс, обозначающий double
    }
}
