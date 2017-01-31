package chapter13.ex17;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pyvov on 17.01.2017.
 * */
/*Hello guys*/
public class Main {
    //main method of a class
    public static void main(String[] args) {
        String s = read(new File("C:\\Users\\pyvov\\IdeaProjects\\PhilosophyOfJavaProjects\\src\\main\\java\\chapter13\\ex17\\Main.java"));;
        Matcher matcher = Pattern.compile("(//(.*)\n)|(/\\*(.*)\\*/)").matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static String read(File file) {
        StringBuilder text = new StringBuilder();

        try {
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    text.append(s);
                    text.append("\n");
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return text.toString();
    }
}
