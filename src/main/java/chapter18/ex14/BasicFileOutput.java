package chapter18.ex14;

import chapter18.io.BufferedInputFile;

import java.io.*;

/**
 * Created by pyvov on 18.02.2017.
 */
public class BasicFileOutput {
    static String file = "src/main/java/chapter18/io/BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        StringBuilder sb1 = new StringBuilder(),
                sb2 = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb1.append("a");
            sb2.append("b");
        }
        String a = sb1.toString();
        String b = sb2.toString();
        BufferedWriter out1 = new BufferedWriter(
                new FileWriter("src/main/java/chapter18/ex14/result.txt")
        );
        FileWriter out2 = new FileWriter("src/main/java/chapter18/ex14/result.txt");
        long t1 = System.nanoTime();
        for (char c : a.toCharArray()) {
            out1.write(c);
        }
        out1.close();
        long t2 = System.nanoTime();
        System.out.println("BufferedWriter time: " + (t2 - t1));
        t1 = System.nanoTime();
        for (char c : b.toCharArray()) {
            out2.write(c);
        }
        out2.close();
        t2 = System.nanoTime();
        System.out.println("FileWriter time: " + (t2 - t1));
    }
}
