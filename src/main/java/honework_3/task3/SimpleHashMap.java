package honework_3.task3;

import java.util.Arrays;
import java.util.Objects;

class Main {

    public static void main(String[] args) {

        SimpleHashMap simple = new SimpleHashMap();

        System.out.println(simple);
        simple.put("first", 101);
        simple.put("second", 201);
        simple.put("third", 301);
        simple.put("forth", 401);
/*        simple.put("fo1th", 401);
        simple.put("fo2th", 401);
        simple.put("fo3th", 401);
        simple.put("fo4th", 401);
        simple.put("fo5th", 401);
        simple.put("fo6th", 401);
        simple.put("fo7th", 401);
        simple.put("fo8th", 401);
        simple.put("fo9th", 401);*/

        System.out.println(simple);
        simple.put("second", 20002);
        System.out.println(simple);
        simple.get("second");
        //System.out.println(simple.get("second"));
        simple.remove("second");
        System.out.println(simple);
    }
}

public class SimpleHashMap<K, V> {

    int capacity = 10;
    Node<K, V>[] table;
    int size;

    SimpleHashMap() {
        this.table = new Node[capacity];
    }

    V put(K key, V value) {
        Node node = new Node(key, value);
        if (size == 0) {
            table[node.hashNode % table.length] = node;
            size++;
            return value;
        }
        int count = 0;
        for (Node<K, V> kvNode : table) {

            if (kvNode != null) {
                //System.out.println(" not null" + kvNode + count);
                if (node.hashNode == kvNode.hashNode) {
                    kvNode.value = (V) node.value;
                    count++;
                    return value;
                }
            }
        }
        if (count == 0) {
            table[node.hashNode % table.length] = node;
            size++;
            return value;
        }
        return value;
    }

    V get(Object key) {
        for (Node<K, V> kvNode : table) {
            if (kvNode != null && kvNode.hashNode == key.hashCode()) {
                return kvNode.value;
            }
        }
        return null;
    }

    V remove(Object key) {
        for (Node<K, V> kvNode : table) {
            if (kvNode != null && kvNode.hashNode == key.hashCode()) {
                table[kvNode.hashNode % table.length] = null;
                size--;
                System.out.println("Remove node: k - " + kvNode.key + ", v - " + kvNode.value);
                return kvNode.value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "SimpleHashMap " + Arrays.toString(table) +
                ", size " + size;
    }

    class Node<K, V> {
        K key;
        V value;
        int hashNode;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.hashNode = key.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return Objects.equals(key, node.key) && Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        @Override
        public String toString() {
            return "Node{" + key +
                    ", " + value + "}";
        }
    }
}