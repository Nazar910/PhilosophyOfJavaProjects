package chapter18.ex10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by pyvov on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please send path of file as a parameter" +
                    "and as optional params send keywords that need to be found");
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
            for (String arg : args) {
                list.stream().filter(o -> o.toLowerCase().contains(arg.toLowerCase()))
                        .forEach(System.out::println);
                System.out.println();
            }
        }
    }
}
