package Array;

import java.util.Arrays;

public class Lonely {
    public static void printLonely(int array[], int n) {
        Arrays.sort(array);
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (array[i + 1] - array[i] > 1) {
                    System.out.print(array[i]);
                }
            } else if (i == n - 1) {
                if (array[i] - array[i - 1] > 1) {
                    System.out.print(array[i]);
                }

            } else {
                if (array[i + 1] - array[i] > 1 && array[i] - array[i - 1] > 1) {
                    System.out.print(array[i] + " ");

                }

            }

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int array[] = { 10, 8, 6, 4, 3 };
        int n = array.length;
        printLonely(array, n);
    }

}
