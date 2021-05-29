package homework_15.task4;

import java.util.*;

public class HashMP<K, V> implements HashMapa {

    private int capacity = 16;
    private float loadFactor = 0.75f;
    private Node<K, V>[] hashTable;
    private int size;

    HashMP() {
        this.hashTable = new Node[capacity];
    }

    @Override
    public void clear() {
        size = 0;
        hashTable = new Node[capacity];
    }

    @Override
    public boolean containsKey(Object key) {
        for (Node<K, V> nodeHT : hashTable) {
            if (nodeHT != null && nodeHT.key.equals(key)) {
                return true;
            }
            Node<K, V> tmp;
            while (nodeHT != null && nodeHT.next != null) {
                tmp = nodeHT.next;
                if (tmp.key.equals(key)) {
                    return true;
                }
                nodeHT = tmp;
            }

        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Node<K, V> nodeHT : hashTable) {
            if (nodeHT.value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set set = new HashSet();
        for (Node<K, V> node : hashTable) {
            if (node != null) {
                set.add(node);
                Node<K, V> tmp = node;
                while (tmp.next != null) {
                    set.add(tmp.next);
                    tmp = tmp.next;
                }
            }
        }
        return set;
    }

    @Override
    public V get(Object key) {
        Node<K, V> tmp;
        for (Node<K, V> node : hashTable) {
            if (node != null) {
                if (node.key == key) {
                    return node.value;
                }
                tmp = node;

                while (tmp.next != null) {
                    if (tmp.key == key) {
                        return tmp.value;
                    }
                    tmp = tmp.next;

                }
            }
        }
        return null;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        for (Node<K, V> node : hashTable) {
            if (node != null && node.next == null) {
                set.add(node.key);
            }

            Node<K, V> tmp = node;
            while (node != null && tmp.next != null) {
                set.add(tmp.key);
                if (tmp.next == null) {
                    return set;
                }
                tmp = tmp.next;

            }
        }
        return set;
    }

    @Override
    public Object put(Object key, Object value) {
        Node<K, V> node = new Node(key, value);
        int index = Math.abs(node.hashcode % hashTable.length);
        if (hashTable[index] == null) {
            hashTable[index] = node;
            size++;
            return node.value;
        } else {
            int count = 0;
            Node<K, V> tmp = null;
            for (Node<K, V> nodes : hashTable) {
                if (nodes != null) {
                    if (nodes.hashcode == node.hashcode) {
                        if (nodes.next == null) {
                            nodes.value = node.value;
                            return node.value;
                        }
                    }
                    if (Math.abs(nodes.hashcode % hashTable.length) == index) {
                        tmp = nodes;
                        while (tmp.next != null) {
                            tmp = tmp.next;
                        }
                        if (tmp.hashcode == node.hashcode) {
                            tmp.value = node.value;
                            return node.value;
                        }
                        tmp.next = node;
                        size++;
                        return node.value;
                    }
                }
                count++;
            }

        }
        return null;
    }

    @Override
    public Object remove(Object key) {
        Node<K, V> tmp = null;
        Node<K, V> prev = null;
        Node<K, V> del = null;
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null && hashTable[i].key.equals(key)) {
                del = hashTable[i];
                hashTable[i] = null;
            }
            if (hashTable[i] != null && hashTable[i].next != null) {
                tmp = hashTable[i];
                while (tmp.next != null) {
                    if (tmp.key.equals(key)) {
                        if(tmp.next == null){
                            prev.next = null;
                        } else {
                            prev.next = tmp.next;
                        }
                        del = tmp;
                        tmp = null;
                        return del;
                    }
                    prev = tmp;
                    tmp = tmp.next;
                }
                if(tmp.next == null){
                    prev.next = null;
                } else {
                    prev.next = tmp.next;
                }
                del = tmp;
                tmp = null;
                return del;
            }
        }
        return del;
    }

    @Override
    public int size() {
        return size;
    }

    void hashFunction() {

    }

    static class Node<K, V> {
        K key;
        V value;
        int hashcode;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.hashcode = key.hashCode();
            this.next = null;
        }

        Node(K key, V value, Node<K, V> next) {
            super();
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node[" + key + ", " + value + ", " + '{' + next + '}' + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Node<K, V> node = (Node<K, V>) obj;
            return Objects.equals(key, node.key) && Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + key.hashCode();
            result = 31 * result + value.hashCode();
            return result;
        }
    }

    @Override
    public String toString() {
        return "HashMP{" + Arrays.toString(hashTable) + '}';
    }
}
