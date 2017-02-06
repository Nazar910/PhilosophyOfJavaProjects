package chapter15.ex29;

import chapter15.generics.Holder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nazar on 04/02/17.
 */
public class Main {
    static void f(Holder<List<?>> holder) {
        Arrays.stream(holder.getValue().getClass().getDeclaredMethods()).
                forEach(System.out::println);
    }

    static void f(List<Holder<?>> list) {
        System.out.println(list.get(0).getValue().getClass().getSimpleName());
    }

    public static void main(String[] args) {
        f(new Holder<List<?>>(new ArrayList<Integer>()));
        List list = new ArrayList<Holder<?>>();
        list.add(new Holder(1));
        f(list);
    }
}
