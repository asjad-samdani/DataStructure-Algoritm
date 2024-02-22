package Array;

public class Monotonic {
    public static boolean isMonotonic(int arr[], int n) {
        boolean isIncreasing = isIncreasing(arr, n);
        boolean isDecreasing = isDecreasing(arr, n);
        return isIncreasing || isDecreasing;
    }

    public static boolean isIncreasing(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;

            }
        }
        return true;
    }

    public static boolean isDecreasing(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2,5};
        int n = arr.length;
        System.out.println(isMonotonic(arr, n));
    }

}