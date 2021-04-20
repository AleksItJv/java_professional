package homework_2.task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int capacity = 10;
        PriorityQueue<Integer> priority = new PriorityQueue<>(10, (integer1, integer2) -> integer2 - integer1);
        Random rnd = new Random();
        for (int i = 0; i < capacity; i++) {
            priority.offer(rnd.nextInt(100));
        }
        System.out.println(priority);

        System.out.print("[");
        String str = "";
        for (int i = 0; i < capacity; i++) {
            str += priority.poll() + ", ";
        }
        System.out.print(str.substring(0, str.length() - 2));
        System.out.println("]");
    }
}
