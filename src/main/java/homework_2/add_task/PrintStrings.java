package homework_2.add_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrintStrings {

    List<String> list = new LinkedList<>();

    public static void main(String[] args) {
        try {
            PrintStrings ps = new PrintStrings();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            boolean bool = true;
            boolean loops;
            while (bool) {
                loops = true;
                str = br.readLine();
                if (str.toLowerCase().equals("end")) {
                    break;
                }
                while (loops) {
                    for (String st : ps.list) {
                        if (str.equals(st)) {
                            loops = false;
                            System.out.println("this is string already exist");
                            break;
                        }
                    }
                    if (loops == false) {
                        break;
                    } else {
                        ps.addToList(str);
                        break;
                    }
                }
            }
            Collections.sort(ps.list);
            for (String st : ps.list) {
                System.out.println(st);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addToList(String str) {
        list.add(str);
    }
}
