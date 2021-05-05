package homework_8.add_task;

import homework_8.add_task.annotation.MathAnno;
import homework_8.add_task.annotation.MathAnnoRepeatable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        Class<?> cl = Main.class;
        System.out.println(cl.getName());
        Method[] mt = cl.getDeclaredMethods();
        for (Method method : mt) {
            Annotation[] anno = method.getDeclaredAnnotations();
            for (Annotation annotation : anno) {
                System.out.println(annotation);
            }
        }
        try {
            Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
            MathAnno mathAnnoRep = method.getAnnotation(MathAnno.class);
            main.mathSum(mathAnnoRep.value()[0].value(), mathAnnoRep.value()[1].value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    @MathAnnoRepeatable(50)
    @MathAnnoRepeatable(100)
    public void mathSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

}
