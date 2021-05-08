package homework_10.add_task;

public class Car implements Cloneable {

    private String model;
    private int year;
    private int weight;

    Car(){

    }

    public Car(String model, int year,int weight) {
        this.model = model;
        this.year = year;
        this.weight = weight;
    }

    /**
     * cloning constructor
     * @param  carCloneable Car object
     */
    public Car(Car carCloneable){
        this(carCloneable.model, carCloneable.year, carCloneable.weight);
    }

    /**
     * Static cloning method
     * @param object - Car object
     * @return - new Car
     */
    public static Car cloningCarMethod(Car object){
        return new Car(object.model, object.year, object.weight);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                '}';
    }
}
