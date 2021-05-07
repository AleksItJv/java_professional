package homework_9.task2;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Animal puma = new Animal("Yellow", 10, true);
        File file = new File("D:\\JAVA\\java_professional\\src\\main\\java\\homework_9\\task2\\task2.txt");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            oos.writeObject(puma);
            Animal newPuma = (Animal) ois.readObject();
            System.out.println(newPuma);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
