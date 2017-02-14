package chapter17.ex39;

import chapter17.containers.Countries;
import chapter17.containers.MapEntry;

import java.util.*;

/**
 * Created by nazar on 13/02/17.
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    static int size = 997;

    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[size];

    @Override
    public V put(K key, V value) {
        int n = 0;
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) n++;
        }
        if (size * 0.75 == n) rehash();
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % size;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if (!found)
            buckets[index].add(pair);
        return oldValue;
    }

    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % size;
        if (buckets[index] == null) return null;
        for (MapEntry<K, V> iPair : buckets[index]) {
            if (iPair.getKey().equals(key)) {
                return iPair.getValue();
            }
        }
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) continue;
            for (MapEntry<K, V> mpair : bucket) set.add(mpair);
        }
        return set;
    }

    private void rehash() {
        size = 2 * size;
        while (!isPrime(size)) size++;
    }

    private boolean isPrime(long n) {
        // fast even test.
        if (n > 2 && (n & 1) == 0)
            return false;
        // only odd factors need to be tested up to n^0.5
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        SimpleHashMap<String, String> m = new SimpleHashMap<>();
        m.putAll(Countries.capitals());
        System.out.println(m);
        System.out.println(m.get("ANGOLA"));
        System.out.println(m.entrySet());
    }
}
