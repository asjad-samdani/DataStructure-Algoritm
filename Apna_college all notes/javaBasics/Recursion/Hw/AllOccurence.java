package Recursion.Hw;

public class AllOccurence {
    public static void printAllOccurence(int array[], int i, int key) {
        if ((i == array.length)) {
            return;

        }
        if (array[i] == key) {
            System.out.print(i + " ");

        }
        printAllOccurence(array, i + 1, key);
    }

    public static void main(String[] args) {
        int array[] = { 9, 4, 2, 5, 6, 7, 8, 4, 2, 2, 6, 7, };
        printAllOccurence(array, 0, 2);
        System.out.println();

    }

}
