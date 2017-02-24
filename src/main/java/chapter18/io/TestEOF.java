package chapter18.io;

import java.io.*;

/**
 * Created by pyvov on 18.02.2017.
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("src/main/java/chapter18/io/TestEOF.java")
                )
        );
        while(in.available() != 0) {
            System.out.print((char)in.readByte());
        }
    }
}
