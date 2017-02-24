package chapter18.io;

import java.io.*;

/**
 * Created by pyvov on 18.02.2017.
 */
public class BasicFileOutput {
    static String file = "src/main/java/chapter18/io/BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("src/main/java/chapter18/io/BasicFileOutput.java")
                )
        );
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file))
        );
        int lineCount = 1;
        String s;
        while((s = in.readLine()) != null) {
            out.println(lineCount++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
