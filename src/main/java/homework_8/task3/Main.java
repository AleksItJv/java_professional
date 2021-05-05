package homework_8.task3;

import homework_8.MyAnnotationDoc;
import homework_8.task3.annotation.AnimalColor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@MyAnnotationDoc(
                author = "Alexander",
                date = "05/05/2021",
                currentRevision = 1,
                lastModified = "05/05/2021",
                lastModifiedBy = "Alexander Kalyuzhniy",
                reviewers = {"Alexander", "Denis"}
)
public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("skin", "bones", "claws", "fangs", "wool", "Black");
        //Wolf wolf = new Wolf();
        System.out.println(wolf);
        Class<?> cl = wolf.getClass();
        Annotation[] annotations = cl.getAnnotations();

        System.out.println("\tClass Annotations:");
        for (Annotation anno : annotations) {
            System.out.println("\t\t" + anno);
        }
        System.out.println("-----Method-----");
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
        System.out.println("-----Fields-----");
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

        try {
            Field fld = cl.getDeclaredField("color");
            AnimalColor animalColor = fld.getAnnotation(AnimalColor.class);
            //System.out.println("Color: " + animalColor.str());
            wolf.color = animalColor.str();
            System.out.println("New wolf color: " + wolf.color);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        Field[] fields2 = cl.getSuperclass().getDeclaredFields();
        for (Field field : fields2) {
            Annotation[] anFieldSuper = field.getAnnotations();
            if (anFieldSuper.length > 0) {
                System.out.println("\t" + field.getName() + ": ");
            } else {
                System.out.println("\t" + field.getName() + ":");
                System.out.println("\t\t annotation not found");
            }
            for (Annotation anField : anFieldSuper) {
                System.out.println("\t\t" + anField);
            }
        }
        Field[] fields3 = cl.getSuperclass().getSuperclass().getDeclaredFields();
        for (Field field3 : fields3) {
            Annotation[] anFieldSuper0 = field3.getAnnotations();
            if (anFieldSuper0.length > 0) {
                System.out.println("\t" + field3.getName() + ": ");
            } else {
                System.out.println("\t" + field3.getName() + ": annotation not found");
            }
            for (Annotation anField : anFieldSuper0) {
                System.out.println("\t\t" + anField);
            }
        }
        System.out.println(wolf);
    }
}
