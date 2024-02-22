package Divide_Conquer;

public class Rotate4 {
    public static int rotatedArray(int numbers[], int tar) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == tar) {
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 4, 5, 6, 7, 0, 1, 2 };
        int tar = 0;
        int index = rotatedArray(numbers, tar);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("found at :" + index);
        }
    }
}