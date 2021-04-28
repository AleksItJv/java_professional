package homework_5.task3;

public class Substring {

    public static void main(String[] args) {

        String string = "Разработчику на Java часто приходится сталкиваться с различными структурами данных. Это могут быть массивы, всевозможные коллекции или реализации Map. Казалось бы, всё с ними ясно и понятно, но существует несколько мелочей, о которые легко Cпоткнуться.";
        StringBuilder str = new StringBuilder(string);
        StringBuilder newSB = new StringBuilder(string.length());
        //System.out.println(newSB.capacity());
        System.out.println(newSB.append(str.substring(0, str.length() / 2)).append("\n").append(str.substring(str.length() / 2 + 1, str.length())));

    }
}
