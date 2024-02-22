package Array;

import java.util.Arrays;

public class Minmax {
    public static void getMinMax(int array[]) {
        if (array == null || array.length == 0)
            return;

        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length - 1];
        for (int i = 1; i < array.length; i++) {
            // min = Math.min(min, array[i]);
            // max = Math.max(max, array[i]);
            // min=Math.min(min, array[i]);
        }
        System.out.println("Min  value is : " + min);
        System.out.println("Max  value is : " + max);
        System.out.println("The sum of the array is " + (max + min));
    }

    public static void main(String[] args) {
        int array[] = { 20, 40, 1, 23, 78, 32, 100, 650 };
        getMinMax(array);

    }

}
