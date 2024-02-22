package Array;

import java.sql.Array;
import java.util.Arrays;

// import java.util.Scanner;

public class Smallest {
    public static int smallest(int numbers[]) {
        // Arrays.sort(numbers);
        int small = numbers[0]; // + infinity
        for (int i = 0; i < numbers.length; i++) {
            // if (small > numbers[i]) {
            // small = numbers[i];

            // }
            small = Math.min(small, numbers[i]);
        }
        return small;

    }

    public static void main(String[] args) {
        int numbers[] = { 10, 20, 30, 50, 60, 1, 8};

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Size of Array");
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // System.out.println("Enter Element");
        // for (int i = 0; i < size; i++) {
        // numbers[i] = sc.nextInt();
        // System.out.println("Smallest value is :" + smallest(numbers));
        // }
        // sc.close();
        System.out.println("The smallest value is : " + smallest(numbers));

    }

}
