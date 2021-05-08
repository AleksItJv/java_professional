package homework_10.add_task;

public class CloningObject {
    public static void main(String[] args) {

        Car car = new Car("LADA", 2002, 1200);
        System.out.println("   Original car: " + car);

        /*---constructor clone---*/
        Car lada2 = new Car(car);
        System.out.println("Constructor car: " + lada2);

        /*---static method---*/
        Car newCar = Car.cloningCarMethod(car);
        System.out.println("     Static car: " + newCar);

        /*---shallow clone---*/
        try {
            Car shallowCar = (Car) car.clone();
            System.out.println("    Shallow car: " + shallowCar);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
