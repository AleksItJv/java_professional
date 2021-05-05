package homework_8.task3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("skin", "bones", "claws", "fangs", "wool", "Black");
        //Wolf wolf = new Wolf();
        System.out.println(wolf);
        Class<?> cl = Wolf.class;
        Annotation[] annotations = cl.getDeclaredAnnotations();

        System.out.println(cl.getName() + "\nAnnotations:");
        for (Annotation anno : annotations) {
            System.out.println(anno);
        }
        Method[] mt = cl.getDeclaredMethods();
        for (Method method : mt) {
            Annotation[] anMethod = method.getAnnotations();
            if (anMethod.length > 0) {
                System.out.println("\t" + method.getName() + ": ");
            }
            for (Annotation annotation : anMethod) {
                System.out.println("\t\t" + annotation);
            }
        }
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] anFields = field.getAnnotations();
            if (anFields.length > 0) {
                System.out.println("\t" + field.getName() + ": ");
            }
            for (Annotation anField : anFields) {
                System.out.println("\t\t" + anField);
            }
        }


    }
}
