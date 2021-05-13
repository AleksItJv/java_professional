package homework_11.task3_REPARS;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


class Main {
    public static void main(String[] args) {
        AnimalPars pars = new AnimalPars("D:\\JAVA\\java_professional\\src\\main\\java\\homework_11\\task3_REPARS\\AnimalPars.xml");

        List names = pars.getValue("name");
        List breeds = pars.getValue("breed");
        System.out.println(names);
        System.out.println(breeds);
    }
}

public class AnimalPars {

    private String xml;

    public AnimalPars(String path) {
        byte[] buffer = null;
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(path, "r");
            buffer = new byte[(int) file.length()];
            file.read(buffer);

            if (file != null) {
                file.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            xml = new String(buffer, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public List getValue(String path) {
        List<String> list = new ArrayList<>();
        String result = "";
        String cut_xml = xml;
        for (int i = 0; i < 3; i++) {
            String toFind = "<" + path + ">";
            int start = cut_xml.indexOf(toFind);
            if (start < 0) {
                return list;
            } else {
                start += toFind.length();
            }
            int end = cut_xml.indexOf("</" + path + ">");
            if (end < 0) {
                return list;
            }
            result = cut_xml.substring(start, end);
            list.add(result);
            cut_xml = cut_xml.substring(end + 3);
        }
        return list;
    }

}


