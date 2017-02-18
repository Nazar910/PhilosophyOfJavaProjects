package chapter18.ex2;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by nazar on 14/02/17.
 */
public class SortedDirList {
    private File file;

    public SortedDirList(String path) {
        this.file = new File(path);
    }

    public String[] list() {
        String[] result = file.list();
        if (result != null) Arrays.sort(result);
        return result;
    }

    public String[] list(String regex) {
        String[] result = file.list((dir, name) -> Pattern.compile(regex).matcher(name).matches());
        if(result != null) Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        SortedDirList dir = new SortedDirList("./src/main/java/chapter18/io/");
        Arrays.stream(dir.list()).forEach(System.out::println);
    }
}
