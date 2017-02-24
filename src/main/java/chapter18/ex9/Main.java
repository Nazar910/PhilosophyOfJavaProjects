package chapter18.ex9;

import java.io.*;
import java.util.LinkedList;

/**
 * Created by pyvov on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Please send path of file as a parameter");
        } else {
            BufferedReader in = new BufferedReader(
                    new FileReader(args[0])
            );
            LinkedList<String> list = new LinkedList<>();
            String s;
            while ((s = in.readLine()) != null) {
                list.add(s.toUpperCase());
            }
            in.close();
            System.out.println(list);
        }
    }
}
