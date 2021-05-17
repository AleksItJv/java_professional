package homework_13.add_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<Integer> count = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {

        Thread frst = new Thread(new WorkFirst(), "first");
        Thread scnd = new Thread(new WorkSecond(), "second");

        frst.start();
        frst.setPriority(10);
        scnd.start();
        scnd.setPriority(1);

    }

}
