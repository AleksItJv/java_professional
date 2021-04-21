package homework_2.add_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class SetStrings {

    Set<String> setStrings = new TreeSet<>();

    public static void main(String[] args) {
        try {
            SetStrings ss = new SetStrings();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            boolean bool = true;
            while (bool) {
                str = br.readLine();
                if (str.toLowerCase().equals("end")) {
                    break;
                }
                ss.addToSet(str);
            }

            for (String st : ss.setStrings) {
                System.out.println(st);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addToSet(String str) {
        setStrings.add(str);
    }

}
