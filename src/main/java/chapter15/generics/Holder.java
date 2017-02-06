package chapter15.generics;

/**
 * Created by nazar on 03/02/17.
 */
class Fruit {}
class Apple extends Fruit {}
class Johnathan extends Apple {}
public class Holder<T> {
    private T value;

    public Holder() {}

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<Apple>(new Apple());
        Apple d = Apple.getValue();
        Apple.setValue(d);
        Holder<? extends Fruit> Fruit = Apple;
        Fruit f = Fruit.getValue();
        d = (Apple) Fruit.getValue();
    }
}











