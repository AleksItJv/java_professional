package homework_9.task2;

import java.io.Serializable;

public class Animal implements Serializable {

    private String color;
    private int age;
    private boolean tail;

    Animal(String color, int age, boolean tail){
        this.color = color;
        this.age = age;
        this.tail = tail;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "color='" + color + '\'' +
                ", age=" + age +
                ", tail=" + tail;
    }
}
