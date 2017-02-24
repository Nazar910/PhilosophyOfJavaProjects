package chapter18.ex15;

import java.io.*;

/**
 * Created by pyvov on 19.02.2017.
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("src/main/java/chapter18/ex15/Data.txt")
                )
        );
        out.writeBoolean(true);
        out.writeByte(8);
        out.writeChar('c');
        out.writeDouble(1.5);
        out.writeFloat(1.6f);
        out.writeInt(1);
        out.writeLong(1L);
        out.writeShort(1);
        out.writeUTF("thats all");
        out.close();

        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("src/main/java/chapter18/ex15/Data.txt")
                )
        );

        System.out.println(in.readBoolean());
        System.out.println(in.readByte());
        System.out.println(in.readChar());
        System.out.println(in.readDouble());
        System.out.println(in.readFloat());
        System.out.println(in.readInt());
        System.out.println(in.readLong());
        System.out.println(in.readShort());
        System.out.println(in.readUTF());
        in.close();
    }
}
