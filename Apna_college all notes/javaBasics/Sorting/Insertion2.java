package Sorting;

public class Insertion2 {
    public static void insertionSort(int numbers[]) {
        for (int i = 1; i < numbers.length; i++) {
            int curr = numbers[i];
            int prev = i - 1;
            while (prev >= 0 && numbers[prev] > curr) {
                numbers[prev + 1] = numbers[prev];
                prev--;

            }
            numbers[prev + 1] = curr;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 4, 3, 6, 2, 1 };
        insertionSort(numbers);
        printArray(numbers);
    }

}
