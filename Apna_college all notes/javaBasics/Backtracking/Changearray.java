package Backtracking;

public class Changearray {
    public static void changeArray(int array[], int i, int val) {
        if (i == array.length) {
            printArray(array);
            return;

        }
        // Recursion
        array[i] = val;
        changeArray(array, i + 1, val+ 1); // function call
        array[i] = array[i] - 2;// Backtracking

    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = new int[5];
        changeArray(array, 0, 1);
        printArray(array);
    }

}
