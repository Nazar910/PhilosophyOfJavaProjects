package chapter5.Initialization;

/**
 * Created by pyvov on 19.10.2016.
 */
public class Leaf {
    int i =0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("BinaryFile = "+i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
