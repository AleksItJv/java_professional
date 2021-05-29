package homework_15.task4;

public class Main {
    public static void main(String[] args) {
        HashMP<String, Integer> hm = new HashMP<>();
        //HashMP.Node<String, Integer> node = new HashMP.Node<>("asd", 5);

        hm.put("first3", 123);
        hm.put("second", 124); //-----
        hm.put("second", 20000);
        hm.put("third4", 125);
        hm.put("forth", 127); //------
        hm.put("forth", 1000);
        hm.put("forth39", 127);
        System.out.println("---------------");

        System.out.println(hm.containsKey("second"));
        System.out.println(hm.containsKey("forth"));
        System.out.println(hm.containsKey("forth39"));
        System.out.println(hm.remove("forth"));

        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.get("forth"));
        System.out.println(hm.keySet());
        System.out.println("entrySet" + hm.entrySet());
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.size());


    }
}
