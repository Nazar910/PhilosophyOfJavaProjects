package chapter16.ex25;

import java.util.*;

/**
 * Created by nazar on 08/02/17.
 */
class MyList extends ArrayList<Integer> {
    public MyList(Collection<? extends Integer> c) {
        super(c);
    }

    public List<Integer> getReversed() {
        this.sort((o1, o2) -> o1 > o2 ? -1 : (o1.equals(o2) ? 0 : 1));
        return this;
    }
}

public class Python {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(aList.getClass().getSimpleName());
        System.out.println(aList);
        System.out.println(aList.get(4));
        aList.add(6);
        aList.addAll(Arrays.asList(7, 8));
        System.out.println(aList);
        List<Integer> aSlice = aList.subList(2, 4);
        System.out.println(aSlice);
        MyList list2 = new MyList(aList);
        System.out.println(list2.getClass().getSimpleName());
        System.out.println(list2.getReversed());
    }
}
