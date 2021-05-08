package homework_10.task3;

public class Animal {

    private String name;
    private boolean beak;
    private int claws;

    Animal(){}

    Animal(String name, boolean beak, int claws){
        this.name = name;
        this.beak = beak;
        this.claws = claws;
    }

    Animal(Animal animal){
        this(animal.name, animal.beak, animal.claws);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBeak() {
        return beak;
    }

    public void setBeak(boolean beak) {
        this.beak = beak;
    }

    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", beak=" + beak +
                ", claws=" + claws +
                '}';
    }
}
