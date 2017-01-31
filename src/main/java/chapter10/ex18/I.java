package chapter10.ex18;

/**
 * Created by pyvov on 11.01.2017.
 */
public interface I {
    void print();
    class Impl implements I {
        public void print() {
            System.out.println("Hello world");
        }

        public static void main(String[] args) {
            I i = new Impl();
            i.print();
        }
    }
}
