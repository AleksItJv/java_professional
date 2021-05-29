package homework_15.task3;

import java.util.Objects;

public class Llist<T> implements LinkInt<T>, Cloneable {

    private Node<T> first;
    private Node<T> last;
    private int size;

    Node<T> instanceNode(int index) {
        Node<T> nodeIndex = first;
        for (int i = 0; i < index; i++) {
            nodeIndex = nodeIndex.next;
        }
        return nodeIndex;
    }

    @Override
    public void add(int index, Object element) {
        indexCorrect(index);
        Node<T> indexNode = new Node(element);
        indexNode.next = instanceNode(index);
        indexNode.prev = instanceNode(index - 1);
        instanceNode(index).prev = indexNode;
        instanceNode(index - 1).next = indexNode;
        size++;
    }

    @Override
    public void addLast(Object element) {
        if (size == 0) {
            Node<T> firstNode = new Node(element);
            firstNode.next = null;
            firstNode.prev = null;
            first = firstNode;
            last = firstNode;
            size++;
            return;
        }
        if (first != null) {
            Node<T> nextNode = new Node<>((T) element);
            last.next = nextNode;
            nextNode.prev = last;
            nextNode.next = null;
            last = nextNode;
            size++;
        }
    }

    @Override
    public void add(Object o) {
        addLast(o);
    }

    @Override
    public void addFirst(Object element) {
        Node<T> addNode = new Node(element);
        addNode.prev = null;
        addNode.next = first;
        first.prev = addNode;
        first = addNode;
        size++;
    }

    boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = size - 1; i > 0; i--) {
            remove(i);
        }
        if (size == 1) {
            first = null;
            last = null;
            size = 0;
        }
    }

    @Override
    public Object clone() {
        Llist<T> clone = superClone();
        return clone;
    }

    @SuppressWarnings("unchecked")
    private Llist<T> superClone() {
        try {
            return (Llist<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    @Override
    public boolean contains(Object object) {
        Node<T> containsNode = first;
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (containsNode.element.equals(object)) {
                result = true;
                break;
            }
            if (containsNode.next == null) {
                //throw new NullPointerException();
            } else {
                containsNode = containsNode.next;
            }
        }
        return result;
    }

    @Override
    public T get(int index) {
        indexCorrect(index);
        Node<T> find = first;
        for (int i = 0; i < index; i++) {
            find = find.next;
        }
        return find.element;
    }

    @Override
    public T getFirst() {
        return first.element;
    }

    @Override
    public T getLast() {
        return last.element;
    }

    @Override
    public int indexOf(Object object) {
        Node find = first;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (find.element.equals(object)) {
                index = i;
                break;
            }
            find = find.next;
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object object) {
        Node<T> find = last;
        int index = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (find.element.equals(object)) {
                index = i;
                break;
            }
            find = find.prev;
        }
        return index;
    }

    @Override
    public T remove(int index) {
        Node<T> removeNode = first;
        for (int i = 0; i < index; i++) {
            removeNode = removeNode.next;
        }
        if (removeNode.prev == null) {
            removeNode.next.prev = null;
            first = removeNode.next;
        } else {
            if (removeNode.next == null) {
                removeNode.prev.next = null;
                last = removeNode.prev;
            } else {
                removeNode.next.prev = removeNode.prev;
                removeNode.prev.next = removeNode.next;
            }
        }
        size--;
        return removeNode.element;
    }

    @Override
    public int remove(Object object) {
        Node<T> removeNode = first;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (removeNode.element.equals(object)) {
                index = i;
                break;
            }
            removeNode = removeNode.next;
        }
        removeNode.next.prev = removeNode.prev;
        removeNode.prev.next = removeNode.next;
        size--;
        return index;
    }

    @Override
    public void set(int index, T element) {
        Node<T> settingNode = first;
        for (int i = 0; i < index; i++) {
            settingNode = settingNode.next;
        }
        settingNode.element = element;
    }

    @Override
    public int size() {
        return size;
    }

    private void indexCorrect(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    @Override
    public String toString() {
        return "Llist{" +
                "first=" + first + ", last=" + last + '}';
    }

    class Node<T> {
        Node<T> prev;
        Node<T> next;
        T element;

        public Node(T element) {
            this.element = element;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(prev, node.prev) && Objects.equals(next, node.next) && Objects.equals(element, node.element);
        }

        @Override
        public int hashCode() {
            return Objects.hash(prev, next, element);
        }

        @Override
        public String toString() {
            return "Node" + "[" + element + ']';
        }
    }

    @Override
    public T iterator() {
        return (T) new Iterattt();
    }

    class Iterattt implements Iter {

        Node<T> nextIt;
        Node<T> prevIt;
        int cursor;

        @Override
        public T next() {
            Node<T> lastReturned = null;
            if (hasNext()) {
                if (cursor == 0) {
                    nextIt = first;
                }
                lastReturned = nextIt;
                nextIt = nextIt.next;
                cursor++;
            }
            return lastReturned.element;
        }

        @Override
        public boolean hasNext() {
            return cursor < size;
        }
    }

}
