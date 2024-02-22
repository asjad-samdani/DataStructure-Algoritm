package Recursion;

public class LastOccurrence {
    public static int lastOccurrence(int array[], int i, int key) {
        if (i==array.length) {
            return -1;
            
        }
        int isFound = lastOccurrence(array, i + 1, key);
        if (isFound == -1 && array[i] == key) {
            return i;

        }
        return isFound;
    }

    public static void main(String[] args) {
        int array[] = { 9, 4, 5, 6, 7, 8, 4, 2, 6, 7, };
        System.out.println(lastOccurrence(array, 0, 6));

    }

}
