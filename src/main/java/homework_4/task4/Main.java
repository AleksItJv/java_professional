package homework_4.task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        String path = "D:\\JAVA\\java_professional\\src\\main\\java\\homework_4\\task4\\anotherText.txt";
        String anotherClass = "D:\\JAVA\\java_professional\\src\\main\\java\\homework_4\\task4\\Main2.java";
        try (OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(path));
             BufferedReader br = new BufferedReader(new FileReader(path));
             OutputStreamWriter os2 = new OutputStreamWriter(System.out)){
/*            if (Files.exists(Path.of(path))) {
                Files.delete(Path.of(path));
            }
            if (Files.exists(Path.of(anotherClass))) {
                Files.delete(Path.of(anotherClass));
            }
            Files.createFile(Path.of(path));
            Files.createFile(Path.of(anotherClass));*/


            os.write("This is a new text \n");
            os.write("This is a new text \n");
            os.write("This is a new text");
            os.flush();
            os.close();


            while (br.ready()){
                os2.write(br.readLine());
            }

            if (br.read() == -1){
                br.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
