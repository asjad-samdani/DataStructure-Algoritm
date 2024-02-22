package Divide_Conquer;

public class RotatedSearch {
    public static int rotatedArray(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        // tar found
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        // mid on l1

        if (arr[si] <= arr[mid]) {
            // case 1

            if (arr[si] <= tar && tar <= arr[mid]) {
                return rotatedArray(arr, tar, si, mid);
            } else {
                return rotatedArray(arr, tar, mid + 1, ei);
            }
            // mid on l2
        } else {
            // case 3
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return rotatedArray(arr, tar, mid + 1, ei);

            } else {
                return rotatedArray(arr, tar, si, mid - 1);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int tar = 7;
        System.out.println(rotatedArray(arr, tar, 0, arr.length - 1));

    }

}
