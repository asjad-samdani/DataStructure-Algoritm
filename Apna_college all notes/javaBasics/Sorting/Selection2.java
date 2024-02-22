package Sorting;

public class Selection2 {
    public static void selectionSort(int numbers[]) {
        // to find the tems
        for (int i = 0; i < numbers.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minPos] > numbers[j]) {
                    minPos = j;

                }
                // Swapping in outer loop
                int temp = numbers[minPos];
                numbers[minPos] = numbers[i];
                numbers[i] = temp;

            }

        }
    }

    public static void printArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 4, 3, 6, 2, 1 };
        selectionSort(numbers);
        printArray(numbers);
    }

}
