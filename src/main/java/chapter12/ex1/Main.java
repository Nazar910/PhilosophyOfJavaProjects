package chapter12.ex1;

/**
 * Created by pyvov on 14.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Test exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }
    }
}
