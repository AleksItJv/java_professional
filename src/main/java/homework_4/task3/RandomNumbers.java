package homework_4.task3;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;

class Main{

    public static void main(String[] args) {

        Random rnd = new Random();
        String path = "D:\\JAVA\\java_professional\\src\\main\\java\\homework4\\task3\\RanNums.txt";
        try{
            if(Files.exists(Path.of(path))){
                Files.delete(Path.of(path));
            }
            Files.createFile(Path.of(path));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));

            int[] arr = new int[rnd.nextInt(20)];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(100);
            }
            for (int i : arr) {
                bw.write(Integer.toString(i) + " ");
            }
            bw.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

            String str;
            System.out.println(str = br.readLine());
            if(br.ready() == false){
                br.close();
            }

            String newStr[] = str.split(" ");
            int[] ars = new int[newStr.length];

            for (int i = 0; i < newStr.length; i++) {
                ars[i] = Integer.parseInt(newStr[i]);
            }
            Arrays.sort(ars);
            System.out.println("Sort numbers: ");
            for (int ar : ars) {
                System.out.print(ar + " ");
            }

        } catch (FileAlreadyExistsException ex) {
            ex.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class RandomNumbers {

}
