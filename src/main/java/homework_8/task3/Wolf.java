package homework_8.task3;

import homework_8.task3.annotation.AnimalColor;
import homework_8.task3.annotation.AnimalRun;

public class Wolf extends Predators {

    String wool;
    @AnimalColor(str = "Grey")
    String color;

    public Wolf(String skin, String bones, String claws, String fangs, String wool, String color) {
        super(skin, bones, claws, fangs);
        this.wool = wool;
        this.color = color;
    }

    @AnimalRun(str = "fast speed")
    public void run() {
    }

    @Override
    public String toString() {
        return "Wolf {" +
                "skin='" + skin + '\'' +
                ", bones='" + bones + '\'' +
                ", claws='" + claws + '\'' +
                ", fangs='" + fangs + '\'' +
                ", wool='" + wool + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
