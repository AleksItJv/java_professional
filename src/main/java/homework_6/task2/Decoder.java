package homework_6.task2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Decoder {

    public static void main(String[] args) {
        String src = "test.txt";
        String st = "";
        String src2 = "test2.txt";
        int capacity = 20;
        char[] arr = new char[capacity];
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));

            int c;
            while ((c = br.read(arr)) > 0) {
                if (c < 20){
                    arr = Arrays.copyOf(arr, c+capacity);
                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(arr);
        //System.out.println(st);
        try(
            BufferedWriter bw = new BufferedWriter(new FileWriter(src2))){
            //bw.write(st);
            bw.write(arr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}