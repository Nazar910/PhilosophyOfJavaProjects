package chapter18.ex27;

import java.io.*;

/**
 * Created by pyvov on 23.02.2017.
 */
class A implements Serializable {
    private B b;

    public A(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A" + b.toString();
    }
}
class B implements Serializable {
    private int i;

    public B(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "B" + this.i;
    }
}
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A(new B(421));
        System.out.println(a);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("src/main/java/chapter18/ex27/test.out")
        );
        out.writeObject(a);
        out.flush();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("src/main/java/chapter18/ex27/test.out")
        );
        A newA =(A) in.readObject();
        System.out.println(a);
    }
}
