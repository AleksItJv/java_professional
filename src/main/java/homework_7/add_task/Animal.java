package homework_7.add_task;

public class Animal {
    public int age = 7;
    private String name = "Cat";
    protected double weight = 10.5d;

    @Override
    public String toString() {
        return "Animal " +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight;
    }
}
