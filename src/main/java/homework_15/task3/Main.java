package homework_15.task3;

public class Main {
    public static void main(String[] args) {
/*        Llist2 list = new Llist2();
        list.addLast("first");
        list.addLast("second");
        list.addLast("third");*/
        Llist list = new Llist();
        list.addLast("first");
        list.addLast("second");
        list.addLast("third");
        list.addLast("four");
        list.addLast("five");

        list.addFirst("new_first");
        System.out.println(list.size());
        //list.add(1, "new");

        System.out.println(list.instanceNode(1));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));

        System.out.println("----------------------------");
        //System.out.println(list.getFirst());
        //System.out.println(list.getLast());
        //System.out.println(list.indexOf("first"));
        //System.out.println(list.lastIndexOf("first"));
        System.out.println("----------------------------");
        System.out.println(list.remove("first"));
        System.out.println(list.size());
        System.out.println("----------------------------");
        list.set(0, "first");
        list.set(4, "five-five");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println("----------------------------");
        System.out.println(list.contains("asd"));
        System.out.println(list.size());
        list.clear();
        //System.out.println(list.remove(4));
        System.out.println(list.size());
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
        System.out.println(list);
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("four");
        list.add("five");
        System.out.println(list);
        System.out.println(list.clone());

        Llist.Iterattt it = (Llist.Iterattt) list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
