package chapter14.typeinfo.pets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pyvov on 21.01.2017.
 */
public class MapData {
    public static Map<Class<? extends Pet>, Integer> map(List<Class<? extends Pet>> keyList, Integer defaultValues) {
        Map<Class<? extends Pet>, Integer> hashMap = new HashMap<Class<? extends Pet>, Integer>();
        for (Class<? extends Pet> petClass : keyList) {
            hashMap.put(petClass, defaultValues);
        }
        return hashMap;
    }
}
