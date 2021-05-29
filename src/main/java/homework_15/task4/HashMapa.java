package homework_15.task4;

import java.util.Map;
import java.util.Set;

public interface HashMapa<K, V> {

    void clear();

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    Set<Map.Entry<K, V>> entrySet();

    V get(K key);

    boolean isEmpty();

    Set<K> keySet();

    Object put(K key, V value);

    V remove(K key);

    int size();
}
