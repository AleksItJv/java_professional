package homework_3.task2;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class Whatafamily {

    public static void main(String[] args) {

        Map<Town, String> townMap = new EnumMap<Town, String>(Town.class);
        townMap.put(Town.MOSKOV, "Ivanovi");
        townMap.put(Town.KIEV, "Petrovi");
        townMap.put(Town.LONDON, "Abromovichi");
        townMap.put(Town.MADRID, "Hohlovi");

        Set set = townMap.entrySet();

        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}

enum Town {

    MOSKOV("Moskov"), KIEV("Kyev"), LONDON("London"), MADRID("Madrid");

    String nameOfTown;

    Town(String nameOfTown) {
        this.nameOfTown = nameOfTown;
    }

    @Override
    public String toString() {
        return nameOfTown;
    }
}