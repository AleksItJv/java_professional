package homework_10.task2_2;

import java.io.Serializable;

public class Bird2 implements Serializable, Cloneable {
    private static int head;
    private final String name;
    private transient int age;

    public Bird2() {
        this.name = "Bird";
    }

    public Bird2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static int getHead() {
        return head;
    }

    public static void setHead(int head) {
        Bird2.head = head;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "head='" + head + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
