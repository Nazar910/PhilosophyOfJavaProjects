package chapter10.ex14;

/**
 * Created by pyvov on 07.01.2017.
 */
public class Apply {
    public static void process(Processor processor, String s) {
        System.out.println("Using processor "+ processor.name());
        System.out.println(processor.process(s));
    }
}
