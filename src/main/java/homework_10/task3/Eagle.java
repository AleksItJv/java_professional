package homework_10.task3;

public class Eagle extends Animal implements Cloneable {

    Eagle(String name, boolean beak, int claws){
        super(name, beak, claws);
    }

    Eagle(Animal animal){
        super(animal);
    }

    public static Eagle cloneEaglestatic(Eagle eagle){
        return new Eagle(eagle.getName(), eagle.isBeak(), eagle.getClaws());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
