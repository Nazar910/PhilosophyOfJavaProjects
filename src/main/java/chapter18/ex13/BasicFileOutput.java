package chapter18.ex13;

import chapter18.io.BufferedInputFile;

import java.io.*;

/**
 * Created by pyvov on 18.02.2017.
 */
public class BasicFileOutput {
    static String file = "src/main/java/chapter18/io/BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(
//                new StringReader(
//                        BufferedInputFile.read("src/main/java/chapter18/io/BasicFileOutput.java")
//                )
//        );
        LineNumberReader in = new LineNumberReader(
                new StringReader(
                        BufferedInputFile.read("src/main/java/chapter18/io/BasicFileOutput.java")
                )
        );
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file))
        );
        String s;
        while((s = in.readLine()) != null) {
            out.println(in.getLineNumber() + ": " + s);
        }
        in.close();
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
