package chapter18.ex12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 * Created by pyvov on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Please send path of file as a parameter");
        } else {
            BufferedReader in = new BufferedReader(
                    new FileReader(args[0])
            );
            LinkedList<String> list = new LinkedList<>();
            String s;
            while ((s = in.readLine()) != null) {
                list.add(s);
            }
            in.close();
            PrintWriter out = new PrintWriter(args[1]);
            int lineNumber = 1;
            for (String str : list) {
                out.println(lineNumber++ + ": " + str);
            }
            out.close();
        }
    }
}
