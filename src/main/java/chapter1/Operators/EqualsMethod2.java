package chapter1.Operators;

/**
 * Created by pyvov on 04.10.2016.
 */
class Value{
    int i;

    @Override
    public boolean equals(Object obj) {
        Value v = (Value) obj;
        return v.i==i;
    }
}
public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}
