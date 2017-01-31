package chapter12.ex22;

/**
 * Created by pyvov on 14.01.2017.
 */
public class FailingConstructor {
    public FailingConstructor() throws Exception {
    }

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
