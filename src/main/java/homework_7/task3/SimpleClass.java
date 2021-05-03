package homework_7.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class SimpleClass {

    public String str = "Stroka";
    private Integer age = 5;
    private int count = 1;

    public SimpleClass() {
    }

    public SimpleClass(String str, Integer age, int count) {
        this.str = str;
        this.age = age;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Class<?> cl = SimpleClass.class;
        System.out.println("-----Modifier-----");
        System.out.println("Class name: " + cl.getName());
        System.out.print("Modifiers of class: ");
        getModificatorName(cl);
        System.out.println("-----Fields-----");
        Field[] fl = cl.getDeclaredFields();
        for (Field field : fl) {
            /*-----------------------*/
            int fieldmods = field.getModifiers();
            if (Modifier.isPrivate(fieldmods)) {
                System.out.print("private ");
            }
            if (Modifier.isAbstract(fieldmods)) {
                System.out.print("abstract ");
            }
            if (Modifier.isStatic(fieldmods)) {
                System.out.print("static ");
            }
            if (Modifier.isFinal(fieldmods)) {
                System.out.print("final ");
            }
            if (Modifier.isPublic(fieldmods)){
                System.out.print("public ");
            }
            if (Modifier.isSynchronized(fieldmods)){
                System.out.print("synchronized ");
            }
            if (Modifier.isProtected(fieldmods)){
                System.out.println("protected ");
            }
            /*------------------------------*/

            System.out.println("" + field.getName() + " (" + field.getType() + ")");
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

    private static void getModificatorName(Class<?> cl) {
        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods)) {
            System.out.print("private ");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.print("abstract ");
        }
        if (Modifier.isStatic(mods)) {
            System.out.print("static ");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("final ");
        }
        if (Modifier.isPublic(mods)){
            System.out.println("public");
        }
    }
}
