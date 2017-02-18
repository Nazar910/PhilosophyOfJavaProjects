package chapter18.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;


/**
 * Created by nazar on 15/02/17.
 */
public final class Directory {
    private static long summ;

    public static File[] local(File dir, final String regex) {
        return dir.listFiles((dir1, name) -> Pattern.compile(regex)
                .matcher(new File(name).getName()).matches());
    }

    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }

    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        //the default iterable element is the file list:
        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        @Override
        public String toString() {
            return "dirs: " + PPrint.pformat(dirs) +
                    "\n\nfiles: " + PPrint.pformat(files);
        }

    }

    public static TreeInfo walk(String start, String regex) {
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) {
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) {
        return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }

    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item : startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else {
                if (item.getName().matches(regex)) {
                    result.files.add(item);
                    summ += item.getTotalSpace();
                }
            }
        }
        return result;
    }

    public static long getSumm() {
        return summ;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(walk("."));
            System.out.println(getSumm());
        } else {
            for (String arg : args) {
                System.out.println(walk(arg));
            }
            System.out.println(getSumm());
        }
    }
}
