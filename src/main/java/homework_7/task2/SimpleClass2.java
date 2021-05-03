package homework_7.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class SimpleClass2 {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        String className = sc.next();*/
        Class<?> cl = Date.class;
        System.out.println(cl);
        System.out.println("-----Fields-----");
        Field[] fl = cl.getDeclaredFields();
        for (Field field : fl) {

            System.out.println(field.getName() + " (" + field.getType() + ")");
        }
        System.out.println("\n-----Constructors-----");
        Constructor<?>[] constructors = cl.getConstructors();
        int cn = 0;
        for (Constructor<?> constructor : constructors) {
            System.out.println("\nConstructor" + (++cn) + ": ");
            Class<?>[] parameters = constructor.getParameterTypes();
            for (Class<?> parameter : parameters) {
                System.out.print(parameter.getName() + " ");
            }
        }
        System.out.println("\n-----Methods-----");
        Method[] mtd = cl.getMethods();
        for (Method method : mtd) {
            System.out.print(method.getName() + " {Rerturn: " + method.getReturnType() + ", Parameters: ");
            Class<?>[] mtdparameters = method.getParameterTypes();
            for (Class<?> mtdparameter : mtdparameters) {
                System.out.print(mtdparameter.getName() + " ");
            }
            System.out.println("}");
        }

    }
}
