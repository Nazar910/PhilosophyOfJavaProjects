package chapter10.ex14;

import chapter9.ex11.*;

/**
 * Created by pyvov on 07.01.2017.
 */
public class StringProcessor {

    public static Processor getStringChangeProcessor() {
        return new Processor() {
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
        };
    }

    public static void main(String[] args) {
        String s = "If the weather is good, we will go to the park";
        Apply.process(getStringChangeProcessor(),s);
    }
}
