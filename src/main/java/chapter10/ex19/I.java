package chapter10.ex19;

/**
 * Created by pyvov on 11.01.2017.
 */
public interface I {
    void hello();
    void bye();
    class Impl implements I{
        public static void doSmth(I i) {
            i.hello();
            i.bye();
        }

        public void hello() {
            System.out.println("Hello");
        }

        public void bye() {
            System.out.println("Bye");
        }

        public static void main(String[] args) {
            doSmth(new Impl());
        }
    }
}
