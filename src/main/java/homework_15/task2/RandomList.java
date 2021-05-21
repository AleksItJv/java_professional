package homework_15.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class RandomList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rn.nextInt(100));
        }
        System.out.println("My new random list: " + list);

        Optional<Integer> stream = list.stream()
                .sorted()
                .map(x -> (int) Math.pow(x, 2))
                .reduce((x, y) -> x + y);
        System.out.println(stream);
}
}

