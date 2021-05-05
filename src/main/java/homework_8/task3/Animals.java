package homework_8.task3;

import homework_8.task3.annotation.FieldAnno;
import homework_8.task3.annotation.MyAnno;

/**
 * @author Alexander
 */

@MyAnno(str = "Animal cl")
public class Animals {

    @FieldAnno("Animal skin")
    String skin;
    @FieldAnno("Animal bones")
    String bones;

    Animals(String skin, String bones) {
        this.skin = skin;
        this.bones = bones;
    }

    /*public void run(){
        System.out.println("normal speed");
    }*/
}
