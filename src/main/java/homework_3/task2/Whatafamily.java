package homework_3.task2;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class Whatafamily {

    public static void main(String[] args) {

        Map<Town, String> townMap = new EnumMap<Town, String>(Town.class);
        townMap.put(Town.MOSKOV, "Ивановы");
        townMap.put(Town.KIEV, "Петровы");
        townMap.put(Town.LONDON, "Абрамовичи");
        townMap.put(Town.MADRID, "Хохловы");

        Set set = townMap.entrySet();

        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}

enum Town {

    MOSKOV("Москва"), KIEV("Киев"), LONDON("Лондон"), MADRID("Мадрид");

    String nameOfTown;

    Town(String nameOfTown) {
        this.nameOfTown = nameOfTown;
    }

    @Override
    public String toString() {
        return nameOfTown;
    }
}
/*Программа определяет, какая семья (фамилия) живёт в городе.
Пример ввода:
Москва - Ивановы
Киев - Петровы
Лондон - Абрамовичи
*/