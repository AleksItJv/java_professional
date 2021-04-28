package homework_5.task4;

import java.util.Arrays;
import java.util.Comparator;

public class Length {
    public static void main(String[] args) {

        String string = "Разработчику на Java часто приходится сталкиваться с различными структурами данных. Это могут быть массивы, всевозможные коллекции или реализации Map. Казалось бы, всё с ними ясно и понятно, но существует несколько мелочей, о которые легко Cпоткнуться. Вставляет одну строку в другую. Также можно вставлять значения других типов, которые будут автоматически преобразованы в строки. Вам надо указать индекс позиции, куда будет вставляться строка.";
        StringBuilder str = new StringBuilder(string);
        String[] strings = string.split("\\.");
        Arrays.sort(strings, (o1, o2) -> o1.length() - o2.length());
        for (String s : strings) {
            System.out.println(s);
        }

    }
}
