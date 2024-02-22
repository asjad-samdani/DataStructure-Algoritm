package Recursion.PracticeMyMe;

public class Problem11 {
    public static int lastOccurrence(int array[], int i, int key) {
        if (i == array.length) {
            return -1;

        }
        int isFound = lastOccurrence(array, i + 1, key);
        if (isFound == -1 && array[i] == key) {
            return i;

        }
        return isFound;
    }

    public static void main(String[] args) {
        int array[] = { 2, 3, 4, 2, 2, 3, 5, 3, 6, 4, 3, 5, 4 };
        System.out.println(lastOccurrence(array, 0, 4));

    }

}
