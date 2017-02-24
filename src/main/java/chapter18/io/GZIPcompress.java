package chapter18.io;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by pyvov on 21.02.2017.
 */
public class GZIPcompress {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println(
                    "Usage: \nGZIPcompress file\n" +
                            "Uses GZIP compression to compress " +
                            "the fiel to test.gz"
            );
            System.exit(1);
        }
        BufferedReader in = new BufferedReader(
                new FileReader(args[0])
        );
        BufferedOutputStream out = new BufferedOutputStream(
                new GZIPOutputStream(
                        new FileOutputStream("C:/users/pyvov/IdeaProjects/PhilosophyOfJavaProjects/src/main/java/chapter18/io/test.gz")
                )
        );
        System.out.println("Writing file");
        int c;
        while((c = in.read()) != -1) {
            out.write(c);
        }
        in.close();
        out.close();
        System.out.println("Reading file");
        BufferedReader in2 = new BufferedReader(
                new InputStreamReader(
                        new GZIPInputStream(
                                new FileInputStream("C:/users/pyvov/IdeaProjects/PhilosophyOfJavaProjects/src/main/java/chapter18/io/test.gz")
                        )
                )
        );
        String s;
        while((s = in2.readLine()) != null){
            System.out.println(s);
        }
    }
}
