package homework_2.task3;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    List<Integer> integerList = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        try {
            Main inst = new Main();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(bf.readLine());
            int count = 0;
            while (count++ < num) {
                inst.getIntegerList(Integer.parseInt(bf.readLine()));
            }
            System.out.println(inst.integerList);
            inst.getMinimum();


        } catch (NumberFormatException exc) {
            System.out.println("Please, enter a number, " + exc.getMessage());
        }
    }

    void getIntegerList(int i) {
        integerList.add(i);
    }

    public void getMinimum() {
        Collections.sort(integerList);
        System.out.println(integerList);
        System.out.println(integerList.get(0));
    }


}
