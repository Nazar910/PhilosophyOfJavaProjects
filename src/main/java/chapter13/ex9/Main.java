package chapter13.ex9;

import chapter13.strings.Splitting;

/**
 * Created by pyvov on 15.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        String knights = Splitting.knights;
        System.out.println(knights.replaceAll("[aouie]","_"));
    }
}
