package homework_15.task3;

public interface LinkInt<T> {
    void add(T e);                      // +

    void add(int index, T element);     // +

    void addFirst(T e);                 // +

    void addLast(T element);            // +

    void clear();                       // +

    Object clone();                     // +

    boolean contains(Object o);         // +

    T get(int index);                   // +

    T getFirst();                       // +

    T getLast();                        // +

    int indexOf(Object o);              // +

    int lastIndexOf(Object o);          // +

    T remove(int index);                // +

    int remove(Object o);               // +

    void set(int index, T element);     // +

    int size();                         // +

    T iterator();                       // +
}
