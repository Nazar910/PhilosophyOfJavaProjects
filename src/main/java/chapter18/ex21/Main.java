package chapter18.ex21;

import chapter18.io.TextFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by pyvov on 20.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0) {
            System.out.println(s.toUpperCase());
        }
        List<String> list = new TextFile("src/main/java/chapter18/ex21/Main.java");
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
}
