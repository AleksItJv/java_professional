package homework_4.task2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        String path = "D:\\JAVA\\java_professional\\src\\main\\java\\homework4\\task2\\testFile.txt";
        try {
            CreateFile crfile = new CreateFile();
            if(Files.exists(Path.of(path))){
                System.out.println("File already exist. Do you want rewrite? Type -- y/n");
                Scanner sc = new Scanner(System.in);
                String answer = sc.nextLine();
                if(answer.toLowerCase(Locale.ROOT).equals("y")){
                    Files.delete(Path.of(path));
                    crfile.createNewFiles(path);
                } else{
                    System.exit(666);
                }
            }
            crfile.createNewFiles(path);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter(path));
            BufferedReader br = new BufferedReader(new FileReader(path))){

            pw.print("Some chars!!! \n");
            pw.print("Some chars");
            //pw.flush();
            pw.close();


            String tmp;
            while ((tmp = br.readLine()) != null) {
                System.out.println(tmp);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


public class CreateFile {

    boolean createNewFiles(String src) throws IOException{
        if (Files.exists(Path.of(src))) {
            return false;
        }
        Files.createFile(Path.of(src));
        return true;
    }
}
