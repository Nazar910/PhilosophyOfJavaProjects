package chapter17.ex36;

import chapter17.containers.Countries;
import chapter17.containers.MapEntry;

import java.util.*;

/**
 * Created by nazar on 12/02/17.
 */
public class SlowMap<K,V> extends AbstractMap<K,V> {
    private List<MapEntry<K,V>> map = new ArrayList<>();

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K,V>> set = new HashSet<>();
        Iterator<MapEntry<K,V>> it = map.iterator();
        while(it.hasNext())
            set.add(it.next());
        return set;
    }

    @Override
    public V put(K key, V value) {
        V oldValue = get(key);
        if (!map.contains(new MapEntry<K, V>(key,value))) {
            map.add(new MapEntry<K, V>(key,value));
        } else {
            map.set(map.indexOf(new MapEntry<>(key, value)), new MapEntry<>(key, value));
        }
        return oldValue;
    }

    @Override
    public V get(Object key) {
        for (MapEntry<K, V> kvMapEntry : map) {
            if (kvMapEntry.getKey().equals(key)) {
                return kvMapEntry.getValue();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SlowMap<String, String> m = new SlowMap<>();
        m.putAll(Countries.capitals(10));
        System.out.println(m);
        System.out.printf(m.get("BULGARIA"));
        System.out.println(m.entrySet());
    }
}
