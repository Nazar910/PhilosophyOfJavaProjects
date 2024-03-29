package chapter18.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by pyvov on 21.02.2017.
 */
public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        FileChannel fc =
                new FileOutputStream("src/main/java/chapter18/io/data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();
        fc = new RandomAccessFile("src/main/java/chapter18/io/data.txt", "rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();

        fc = new FileInputStream("src/main/java/chapter18/io/data.txt").getChannel();
        ByteBuffer buff =  ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while(buff.hasRemaining())
            System.out.print((char)buff.get());
    }
}
