package Recursion;

public class SortedArray {
    public static boolean sortedArray(int array[], int i) {
        if (i == array.length - 1) {
            return true;
        }
        if (array[i] >=array[i + 1]) {
            return false;
        }
        return sortedArray(array, i + 1);

    }

    public static void main(String[] args) {
        int array[] = { 4, 5,6,7,3};
        System.out.println(sortedArray(array, 0));

    }

}
