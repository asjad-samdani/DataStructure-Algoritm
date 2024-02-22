package Recursion;

public class FindIndex {
    public static void allOccurences(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");

        }
        allOccurences(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 2, 2, 6 };
        int key = 2;
        allOccurences(arr, key, key);
        System.out.println();
    }

}
