package Sorting.Practice;

public class Selection2 {
    public static void selectionSort(int number[]) {
        // turns
        for (int i = 0; i < number.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < number.length; j++) {
                if (number[minPos] < number[j]) {
                    minPos = j;
                }

            }
            // Swapping
            int temp = number[minPos];
            number[minPos] = number[i];
            number[i] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selectionSort(number);
        printArray(number);
    }

}
