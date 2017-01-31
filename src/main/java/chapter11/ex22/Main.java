package chapter11.ex22;

import java.util.*;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    private static String text = "Today is a beautiful day The weather is good " +
            "the sun is shining Beautiful ";
    private static HashSet<MockMap> hashSet = new HashSet<MockMap>();

    public static void main(String[] args) {
        for (String s : text.toLowerCase().split(" ")) {
            MockMap mockMap = new MockMap(s, 1);
            MockMap iterated = myContains(mockMap);
            if (iterated != null) {
                mockMap.setValue(iterated.getValue() + 1);
                hashSet.remove(iterated);
            }
            hashSet.add(mockMap);
        }
        System.out.println(hashSet);
        LinkedList<MockMap> list = new LinkedList<MockMap>(hashSet);
        Collections.sort(list, new Comparator<MockMap>() {
            public int compare(MockMap o1, MockMap o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println(list);
    }
    private static MockMap myContains(MockMap mockMap) {
        Iterator<MockMap> it =hashSet.iterator();
        while (it.hasNext()) {
            MockMap iterated = it.next();
            if (iterated.getKey().equals(mockMap.getKey())) {
                return iterated;
            }
        }
        return null;
    }
}
