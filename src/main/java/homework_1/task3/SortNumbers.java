package homework_1.task3;

import java.util.Arrays;
import java.util.Collections;

public class SortNumbers {

    public static void main(String[] args) {
        int count = 0;

        Double[] array = {11d, 55d, 33d, 55d, 90.4, 44d, 22d, 78d, 4d};
        Double[] result = new Double[array.length];
        Double tmp;
        for (int i = 0; i < array.length; i++) {
            tmp = Math.floor(array[i]);
            if (tmp % 2 != 0) {
                result[count++] = tmp;
            }
        }
        Double[] arr = Arrays.copyOf(result, count);
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        int revers = 0;
        Double[] result2 = new Double[array.length - count];
        for (int i = 0; i < array.length; i++) {
            if (((int) Math.floor(array[i])) % 2 == 0) {
                result2[revers++] = array[i];
            }
        }
        Arrays.sort(result2, Collections.reverseOrder());

        array = Arrays.copyOf(arr, array.length);
        //System.out.println(Arrays.toString(array));
        System.arraycopy(result2, 0, array, count, revers);
        System.out.println(Arrays.toString(array));
    }
}
