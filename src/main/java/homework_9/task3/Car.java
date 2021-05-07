package homework_9.task3;

import java.io.*;
import java.util.Arrays;

public class Car implements Externalizable {

    private transient String color;
    private Tires[] tires;
    private Engine engine;

    public Car() {

    }

    Car(String color, Tires[] tires, Engine engine) {
        this.color = color;
        this.tires = tires;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", tires=" + Arrays.toString(tires) +
                ", engine=" + engine +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(color);
        out.writeObject(tires);
        out.writeObject(engine);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        color = (String) in.readObject();
        tires = (Tires[]) in.readObject();
        engine = (Engine) in.readObject();
    }
}

class Tires implements Serializable {
    private String tire = "Tire";

    Tires(String tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "T{" + tire + "}";
    }
}

class Engine implements Serializable {
    private String engine = "Engine";

    @Override
    public String toString() {
        return "{" + engine + "}";
    }
}
