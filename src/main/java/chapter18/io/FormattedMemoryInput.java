package chapter18.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Created by pyvov on 18.02.2017.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("src/main/java/chapter18/io/FormattedMemoryInput.java")
                            .getBytes()
                    )
            );
            while(true)
                System.out.print((char)in.readByte());
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
