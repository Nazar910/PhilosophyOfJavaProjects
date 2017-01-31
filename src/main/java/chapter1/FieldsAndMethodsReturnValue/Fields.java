package chapter1.FieldsAndMethodsReturnValue;

/**
 * Created by pyvov on 23.09.2016.
 */
public class Fields {
    int x;

    public static void main(String[] args) {
        Fields f = new Fields();
        System.out.println(f.x); // f.x будет 0, потому что х является полем класса
        int x;
        //System.out.println(x);   // х будет присвоено случайное значение так как это локальная переменная
    }
}
