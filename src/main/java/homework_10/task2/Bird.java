package homework_10.task2;

import java.io.*;

public class Bird implements Externalizable {

    private static int head;
    private final String name;
    private transient int age;

    public Bird() {
        this.name = "Bird";
    }

    public Bird(int head, String name, int age) {
        this.head = head;
        this.name = name;
        this.age = age;
    }

    public static int getHead() {
        return head;
    }

    public static void setHead(int head) {
        Bird.head = head;
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //out.writeObject(name);
        out.writeObject(age);
        out.writeObject(head);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //name = (String) in.readObject();
        age = (int) in.readObject();
        head = (int) in.readObject();
    }
}
