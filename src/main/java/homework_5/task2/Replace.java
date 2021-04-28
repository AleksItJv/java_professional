package homework_5.task2;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {

        //example 1
/*        String string = "Разработчику на Java часто приходится сталкиваться с различными структурами данных. Это могут быть массивы, всевозможные коллекции или реализации Map. Казалось бы, всё с ними ясно и понятно, но существует несколько мелочей, о которые легко Cпоткнуться.";
        StringBuilder str = new StringBuilder(string);
        System.out.println(str);
        String strSub1 =str.substring(0,12);
        String strSub2 = str.substring(str.length() - 13 ,str.length() - 1);
        str.replace(0, 12, strSub2);
        str.replace((str.length()- 12) ,(str.length() -1 ), strSub1);
        System.out.println(str);*/

        //example2
        String string = "Разработчику на Java часто приходится сталкиваться с различными структурами данных. Это могут быть массивы, всевозможные коллекции или реализации Map. Казалось бы, всё с ними ясно и понятно, но существует несколько мелочей, о которые легко Cпоткнуться.";
        StringBuilder str = new StringBuilder(string);
        System.out.println("start: \n" + str);
        StringBuilder fin = new StringBuilder(string.length());
        String[] arr = string.split("\\.");

        for (int i = 0; i < arr.length; i++) {
            fin.append(arraySpace(arr[i].trim()).append("."));
        }
        System.out.println("final: \n" + fin);
    }

    private static StringBuilder arraySpace(String s) {
        String[] miniarr = s.split(" ");
        StringBuilder bild = new StringBuilder();
        String tmp = miniarr[0];
        miniarr[0] = miniarr[miniarr.length - 1];
        miniarr[miniarr.length - 1] = tmp;
        String ret = miniarr.toString();

        for (String s1 : miniarr) {
            bild.append(s1).append(" ");
        }
        return bild;

    }
}

