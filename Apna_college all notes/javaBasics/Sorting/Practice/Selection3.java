package Sorting.Practice;

public class Selection3 {
    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPos] < array[j]) {
                    minPos = j;
                }
            }
            // swapping
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selectionSort(array);
        printArray(array);
    }

}
