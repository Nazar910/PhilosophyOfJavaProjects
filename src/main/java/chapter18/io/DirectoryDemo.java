package chapter18.io;


import java.io.File;

/**
 * Created by nazar on 15/02/17.
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        //all directories
        PPrint.pprint(Directory.walk(".").dirs);
        //all files that startsWith 'T'
        for (File file : Directory.local(".", "T.*")) System.out.println(file);
        System.out.println("------------------");
        for (File file : Directory.walk(".", "T.*\\.java")) System.out.println(file);
        System.out.println("==================");
        //Classes that contains 'Z' or 'z'
        for (File file : Directory.walk(".", ".*[Zz].*\\.class")) System.out.println(file);
    }
}
