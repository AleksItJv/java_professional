package homework_10.task3;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Animal originalAnimal = new Animal("Bird", true, 8);
        Eagle eagle1 = new Eagle(originalAnimal);
        eagle1.setName("Orel");
        System.out.println("Standart bird: " + originalAnimal);
        System.out.println("Copy eagle: " + eagle1);

        try {
            Eagle eagle2 = (Eagle) eagle1.clone();
            System.out.println("This is clone: " + eagle2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        System.out.println("---Static--------------------------------");
        Eagle otherEagle = new Eagle("Egl", false, 12);
        Eagle newEagle = Eagle.cloneEaglestatic(otherEagle);
        newEagle.setName("Taras");
        System.out.println("Other Eagle: " + otherEagle);
        System.out.println("New Eagle: " + newEagle);

        System.out.println("---Reflection-----------------------------------");
        Eagle reflectionEagle = reflectionCloning(otherEagle);
        System.out.println(reflectionEagle);

    }

    /**
     * reflection cloning
     * @param otherEagle - instance of Eagle
     * @return clone instance (otherEagle)
     */
    private static Eagle reflectionCloning(Eagle otherEagle) {
        Class<?> cl = Eagle.class;
/*        Field[] fields = cl.getSuperclass().getDeclaredFields();
        for (Field field : fields) {
            System.out.print(field.getName() + " ");
        }*/
        try {
            Field name = Eagle.class.getSuperclass().getDeclaredField("name");
            Field beak = Eagle.class.getSuperclass().getDeclaredField("beak");
            Field claws = Eagle.class.getSuperclass().getDeclaredField("claws");

            name.setAccessible(true);
            beak.setAccessible(true);
            claws.setAccessible(true);

            name.set(otherEagle, "Reflex");
            beak.set(otherEagle, true);
            claws.set(otherEagle, 6);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return otherEagle;
    }
}
