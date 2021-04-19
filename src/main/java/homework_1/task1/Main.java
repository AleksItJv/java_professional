package homework_1.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 17, 4000);
        Animal bird = new Animal("King Penguin", 15, 8, 50000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);   // ClassCastException w/o Comparable

        for (Animal tmp : c) {
            System.out.println(tmp);
        }

        System.out.println("\n--------SortByBreed--------");
        Arrays.sort(c, new SortByBreed());

        for (Animal tmp : c) {
            System.out.println(tmp);
        }

        System.out.println("\n--------SortBySpeed--------");
        Arrays.sort(c, new SortBySpeed());

        for (Animal tmp : c) {
            System.out.println(tmp);
        }

        System.out.println("\n--------SortByWeight--------");
        Arrays.sort(c, new SortByWeight());

        for (Animal tmp : c) {
            System.out.println(tmp);
        }

        System.out.println("\n--------SortByPrice--------");
        Arrays.sort(c, new Comparator<Animal>() {
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getPrice() - animal2.getPrice();
            }
        });

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
