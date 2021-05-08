package homework_10.task2_2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        Bird2 bird = new Bird2("Pavlin", 10);
        Bird2 cloneBird = null;
        try {
            cloneBird = (Bird2) bird.clone();
            Field nameF = Bird2.class.getDeclaredField("name");
            nameF.setAccessible(true);
            nameF.set(cloneBird, bird.getName());

        } catch (CloneNotSupportedException | NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(bird);
        System.out.println(cloneBird);
    }
}
