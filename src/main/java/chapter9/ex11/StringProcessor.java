package chapter9.ex11;

/**
 * Created by pyvov on 07.01.2017.
 */
public class StringProcessor {

    public static void main(String[] args) {
        String s = "If the weather is good, we will go to the park";
        Apply.process(new ChangeString(),s);
    }
}
