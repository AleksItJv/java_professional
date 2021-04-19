package homework_1.task1;

import java.util.Comparator;

public class Animal implements Comparable { // <Animal>{
    private String breed;
    private int weight;
    private int speed;
    private int price;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене - > модели -> цвету машины
    public int compareTo(Object obj) {              //    public int compareTo(Animal o) {
        int nextCompare = this.speed - ((Animal) obj).speed; //    int tmp = this.speed - o.speed;
        if (nextCompare == 0) {
            int nextCompare2 = this.price - ((Animal) obj).price;
            if (nextCompare2 == 0) {
                int nextCompare3 = this.weight - ((Animal) obj).weight;
                if (nextCompare3 == 0) {
                    return this.breed.compareTo(((Animal) obj).breed);
                }
                return nextCompare3;
            }
            return nextCompare2;
        } else {
            return nextCompare;
        }
    }

    // Сравнение 2-х строковых значений
    // return this.breed.compareTo(((Animal)o).breed);
}

class SortByBreed implements Comparator<Animal> {

    @Override
    public int compare(Animal obj1, Animal obj2) {
        return obj1.getBreed().compareTo(obj2.getBreed());
    }
}

class SortByWeight implements Comparator<Animal> {

    @Override
    public int compare(Animal obj1, Animal obj2) {
        return obj1.getWeight() - obj2.getWeight();
    }
}

class SortBySpeed implements Comparator<Animal> {

    @Override
    public int compare(Animal obj1, Animal obj2) {
        return obj1.getSpeed() - obj2.getSpeed();
    }
}
