package chapter18.ex20;

import chapter18.io.BinaryFile;
import chapter18.io.Directory;

import java.io.File;

/**
 * Created by pyvov on 20.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        for (File file : Directory.walk("src/main/java/chapter18/ex20","\\w*.class")) {
//             BinaryFile.read(file);
        }
    }
}
