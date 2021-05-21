package homework_15.task3;

public class Llist<T>{

    private int indexNode;
    private  Node<T> first;
    private  Node<T> last;
    int size;

    class Node<E> {
        int index;
        Node<E> prev;
        Node<E> next;
        E element;

        public Node(E element) {
            this.index = size;
            this.element = element;
        }

        @Override
        public String toString() {
            return "Node" + index +
                    "[el:" + element +
                    ", Prev:" + prev +
                    ", next=" + next +
                    ']';
        }
    }

    void addElement(T element) {

        if (size == 0) {
            Node<T> firstNode = new Node<>(element);
            firstNode.next = null;
            firstNode.prev = null;
            first = firstNode;
            last = firstNode;
            size++;
        } else {
            if (first != null) {
                Node<T> nextNode = new Node<>(element);
                Node<T> tmp = last;
                nextNode.prev = last;
                nextNode.next = null;
                //last.next = nextNode;
                last = nextNode;
                size++;
            }
        }
    }


    boolean isEmpty(){
        if (size == 0){
        }
        return true;
    }

    @Override
    public String toString() {
        return "Llist{" +
                //"indexNode=" + indexNode +
                ", first=" + first + "\n" +
                ", last=" + last + "\n" +
                //", size=" + size + "\n" +
                '}';
    }
}
