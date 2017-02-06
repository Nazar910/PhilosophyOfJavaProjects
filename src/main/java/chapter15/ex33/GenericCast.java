package chapter15.ex33;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazar on 05/02/17.
 */
class FixedSizeStack<T> {
    private List<Object> storage = new ArrayList<>();
    private int index = 0;

    public void push(T item) {
        storage.add(item);
        index++;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        return (T) storage.get(--index);
    }
}

public class GenericCast {

    public static void main(String[] args) {
        FixedSizeStack<String> strings =
                new FixedSizeStack<>();
        for (String s : "A B C D E F G H I J".split(" ")) {
            strings.push(s);
        }
        for (int i = 0; i < 10; i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }
    }
}
