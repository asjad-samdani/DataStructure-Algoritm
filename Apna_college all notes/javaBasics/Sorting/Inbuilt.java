package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class Inbuilt {
    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 3, 6, 4, 7, 1, 2, 9, };
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArray(arr);
    }
}
