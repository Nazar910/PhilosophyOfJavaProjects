package chapter11.ex23;

import java.util.*;

/**
 * Created by pyvov on 13.01.2017.
 */
public class StatisticsNew {
    private static Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) {
            Random rand = new Random(47);
            Map<Integer, Integer> m =
                    new HashMap<Integer, Integer>();
            for (int i = 0; i < 10000; i++) {
                int r = rand.nextInt(20);
                Integer freq = m.get(r);
                m.put(r, freq == null ? 1 : freq + 1);
            }
            Integer maxValue = Collections.max(m.values());
            Integer keyOfMaxValue = 0;
            for (Integer i : m.keySet()) {
                if (m.get(i).equals(maxValue)) {
                    keyOfMaxValue = i;
                    break;
                }
            }
            Integer value = hashMap.get(keyOfMaxValue);
            hashMap.put(keyOfMaxValue, value == null ? 1 : value + 1);
        }
        System.out.println(hashMap);
    }
}
