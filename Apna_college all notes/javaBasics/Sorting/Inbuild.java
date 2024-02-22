package Sorting;

import java.util.Arrays;

public class Inbuild {
    public static void printArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 3, 5, 2, 8, 9, 1, 2 };
        Arrays.sort(numbers);
        printArray(numbers);
    }

}
