package chapter12.ex26;

import java.io.FileInputStream;

/**
 * Created by pyvov on 14.01.2017.
 */
public class MainException {
    public static void main(String[] args) throws Exception {
        FileInputStream file =
                new FileInputStream("MainException.java");
        file.close();
    }
}
