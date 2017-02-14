package chapter17.ex26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nazar on 13/02/17.
 */
public class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;
    private char c = 0;

    public CountedString(String s) {
        this.s = s;
        created.add(s);
        for (String s2 : created) {
            if (s2.equals(s)) id++;
        }
    }

    @Override
    public String toString() {
        return "String: " + s + " id: " + id + " c:" + c + " hashCode(): " + hashCode();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        result = 37 * result + (int)c;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CountedString &&
                s.equals(((CountedString)obj).s) &&
                id == ((CountedString)obj).id &&
                c == ((CountedString)obj).c;
    }

    public static void main(String[] args) {
        Map<CountedString,Integer> map = new HashMap<>();
        CountedString[] cs = new CountedString[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi");
            map.put(cs[i], i);
        }
        System.out.println(map);
        for (CountedString countedString : cs) {
            System.out.println("Looking up " + countedString);
            System.out.println(map.get(countedString));
        }
    }
}
