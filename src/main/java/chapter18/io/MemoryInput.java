package chapter18.io;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by pyvov on 18.02.2017.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read("src/main/java/chapter18/io/MemoryInput.java")
        );
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char)c);
        }
    }
}
