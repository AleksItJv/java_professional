package homework_6.task2;

import java.io.*;

public class Decoder {

    public static void main(String[] args) {
        String src = "D:\\JAVA\\java_professional\\test.txt";
        String src2 = "D:\\JAVA\\java_professional\\test2.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(src));
            bw = new BufferedWriter(new FileWriter(src2));

            int tmp;
            String str = "";
            while ((tmp = br.read()) > 0){
                str += (char) tmp;
            }
            String newstr = str.replaceAll("(\\b[a-z]{2}[\\s?|\\W?])|(\\b[a-z][\\s?|\\W?])|(\\bthe\\b)|(\\band\\b)", "JAVA ");
            bw.write(newstr);

            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}