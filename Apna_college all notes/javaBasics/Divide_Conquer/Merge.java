package Divide_Conquer;

public class Merge {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int array[], int si, int ei) {
        if (si >= ei) {
            return;

        }
        int mid = si + (ei - si) / 2;
        mergeSort(array, si, mid);
        mergeSort(array, mid + 1, ei);
        merge(array, si, mid, ei);
    }

    public static void merge(int array[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;

        }
        while (i <= mid) {
            temp[k++] = array[i++];

        }
        while (j <= ei) {
            temp[k++] = array[j++];

        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            array[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int array[] = { 4, 9, 5, 1, 6, 10, 8, 3, 11 };
        mergeSort(array, 0, array.length-1);
        printArray(array);

    }

}
