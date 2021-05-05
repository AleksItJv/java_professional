package homework_8.task3;

import homework_8.task3.annotation.FieldFangs;
import homework_8.task3.annotation.PredatorsAnno;

@PredatorsAnno(str = "Predator!")
public class Predators extends Animals {

    String claws;
    @FieldFangs(str = "two fangs")
    String fangs;

    public Predators(String skin, String bones, String fangs, String claws) {
        super(skin, bones);
        this.claws = claws;
        this.fangs = fangs;
    }

    public void whatEats() {
        System.out.println("eating meet");
    }


}
