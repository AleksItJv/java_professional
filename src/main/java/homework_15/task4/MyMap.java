package homework_15.task4;

import java.util.Map;
import java.util.Set;

public interface MyMap<K, V> {

    void clear();

    boolean containsKey(K key);

    boolean containsValue(V value);

    Set<Map.Entry<K, V>> entrySet();

    V get(K key);

    boolean isEmpty();

    Set<K> keySet();

    V put(K key, V value);

    V remove(K key);

    int size();
}
