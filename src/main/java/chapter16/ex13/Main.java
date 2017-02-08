package chapter16.ex13;

import chapter15.generics.Generator;
import chapter16.arrays.CountringGenerator;

/**
 * Created by nazar on 07/02/17.
 */
public class Main {
    public static void main(String[] args) {
        String s;
        StringBuilder sb = new StringBuilder();
        Generator<Character> gen = new CountringGenerator.Character();
        for (int i = 0; i < 10; i++) {
            sb.append(gen.next());
        }
        s = sb.toString();
        System.out.println(s);
    }
}
