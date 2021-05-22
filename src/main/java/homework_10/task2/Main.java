package homework_10.task2;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird(1, "Gorobec", 3);

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);

            oos.writeObject(bird);
            oos.flush();
            oos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            try {
                Bird cloneBird = (Bird) ois.readObject();
                ois.close();
                System.out.println(cloneBird);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
