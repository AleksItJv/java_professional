package homework_9.task3;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Black", new Tires[]{new Tires("Pirelli"), new Tires("Pirelli"), new Tires("Pirelli"), new Tires("Pirelli"), new Tires("Pirelli")}, new Engine());
        System.out.println(car);

        File file = new File("D:\\JAVA\\java_professional\\src\\main\\java\\homework_9\\task3\\test.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            oos.writeObject(car);
            car = null;
            System.out.println(car);
            car = (Car) ois.readObject();
            System.out.println(car);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
