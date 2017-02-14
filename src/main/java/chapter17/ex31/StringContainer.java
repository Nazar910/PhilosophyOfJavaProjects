package chapter17.ex31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nazar on 14/02/17.
 */
public class StringContainer {
    private String[] array;
    private int index;

    public StringContainer() {
        array = new String[5];
    }

    public StringContainer(int size) {
        array = new String[size];
    }

    public boolean add(String item) {
        if (index +1 >= array.length) {
            String[] newArray = new String[array.length];
            System.arraycopy(array, 0 ,newArray, 0, array.length);
            array= new String[array.length + 10];
            System.arraycopy(newArray, 0, array, 0, newArray.length);
        }
        array[index++] = item;
        return true;
    }

    public boolean delete(String item) {
        int k = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(item)) {
                k = i;
                break;
            }
        }
        if (k != -1) {
            int newSize = array.length - 1;
            String[] newArray = new String[newSize];
            System.arraycopy(array, 0, newArray, 0, k);
            System.arraycopy(array, k + 1, newArray, k, array.length - 1 - k);
            array = newArray;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        Matcher m = Pattern.compile(", null").matcher(Arrays.toString(array));
        return m.replaceAll("");
    }

    public static void main(String[] args) {
        StringContainer stringContainer = new StringContainer();
        long addTime1 = System.nanoTime();
        stringContainer.add("hello");
        addTime1 = System.nanoTime() - addTime1;
        stringContainer.add("world");
        stringContainer.add("hELOO");
        stringContainer.add("hE");
        stringContainer.add("world!");
        long badAddTime1 = System.nanoTime();
        stringContainer.add("worl");
        badAddTime1 = System.nanoTime() - badAddTime1;
        System.out.println(stringContainer);
        long deleteTime1 = System.nanoTime();
        stringContainer.delete("hell");
        deleteTime1 = System.nanoTime() - deleteTime1;
        System.out.println(stringContainer);
        List<String> list = new ArrayList<>();
        long listAddTime = System.nanoTime();
        list.add("hello");
        listAddTime = System.nanoTime() - listAddTime;
        long listRemoveTime = System.nanoTime();
        list.remove(0);
        listRemoveTime = System.nanoTime() - listRemoveTime;

        System.out.println("Container: addTime = " + addTime1 + "; badAddTime = " + badAddTime1 + "; deleteTime = " + deleteTime1);
        System.out.println("List: addTime = " + listAddTime + "; removeTime = " + listRemoveTime);
    }
}
