package chapter18.ex7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by pyvov on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new FileReader("src/main/java/chapter18/ex7/1.txt")
        );
        LinkedList<String> list = new LinkedList<>();
        String s;
        while ((s = in.readLine()) != null) {
            list.add(s);
        }
        in.close();
        while (list.peek() != null) {
            System.out.println(list.pollLast());
        }
    }
}
