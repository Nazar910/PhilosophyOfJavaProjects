package chapter18.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by nazar on 14/02/17.
 */
public class DirList3 {

    public static void main(final String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) list = path.list();
        else list = path.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(args[0]);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
//        else list = path.list((dir, name) -> Pattern.compile(args[0]).matcher(name).matches());
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
