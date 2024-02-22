package Array;

import java.util.Scanner;

public class Linear {
    public static int liner(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Array size");
        // int size = sc.nextInt();
        int size = 5;
        int numbers[] = new int[size];
        System.out.println("Enter array element");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int key = 50;

        int index = liner(numbers, key);
        if (index == -1) {
            System.out.println("Not found ");
        } else {
            System.out.println("Key found at  index :" + index);
        }
        sc.close();

    }

}
