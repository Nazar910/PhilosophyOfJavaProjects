package chapter9.ex11;

/**
 * Created by pyvov on 07.01.2017.
 */
public class ChangeString implements Processor {
    public String process(String s) {
        int i = 0;
        StringBuilder buf = new StringBuilder();
        while(i<s.length()) {
            buf.append(s.charAt(i+1));
            buf.append(s.charAt(i));
            i+=2;
        }
        return buf.toString();
    }

    public String name() {
        return this.getClass().getSimpleName();
    }
}
