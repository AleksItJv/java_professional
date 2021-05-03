package homework_7.add_task;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) {
        try {
        Class<?> cl = Animal.class;
        Animal animal = new Animal();
        System.out.println(cl.getName());
        Field[] fl = cl.getDeclaredFields();
        for (Field field : fl) {
            System.out.println(field.getName() + " <" + field.getType() + ">");
        }
        Field field1 = cl.getDeclaredField("age");
        Field field2 = cl.getDeclaredField("name");
        Field field3 = cl.getDeclaredField("weight");

            System.out.println("ols values\n" + animal);
            field1.setInt(animal, 20);
            field2.setAccessible(true);
            field2.set(animal, "Markiz");
            field3.setDouble(animal, 30.5);
                System.out.println("new values\n" + animal);

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
