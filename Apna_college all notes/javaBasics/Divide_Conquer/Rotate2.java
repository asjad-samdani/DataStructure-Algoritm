package Divide_Conquer;

public class Rotate2 {
    public static int search(int array[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;

        }
        int mid = si + (ei - si) / 2;
        if (array[mid] == tar) {
            return mid;

        }
        // mid on l1

        if (array[si] <= array[mid]) {
            // case:1
            if (array[si] <= tar && tar <= array[mid]) {
                return search(array, tar, si, mid);
                // Case :2
            } else {
                return search(array, tar, mid + 1, ei);
            }

        }
        // Line 2
        else {
            // Case:3
            if (array[mid] <= tar && tar <= array[ei]) {
                return search(array, tar, mid + 1, ei);
                // case:4

            } else {
                return search(array, tar, si, mid - 1);
            }

        }

    }

    public static void main(String[] args) {
        int array[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;
        int tarIdx = search(array, target, 0, array.length - 1);
        System.out.println(tarIdx);
    }

}
