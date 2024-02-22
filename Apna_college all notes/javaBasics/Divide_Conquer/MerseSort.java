package Divide_Conquer;

public class MerseSort {
    public static void printArr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void merseSort(int array[], int si, int ei) {
        if (si >= ei) {
            return;

        }
        int mid = si + (ei - si) / 2;// si+ei/2
        merseSort(array, si, mid);
        merseSort(array, mid + 1, ei);
        merge(array, si, mid, ei);
    }

    public static void merge(int array[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;// iteration for left
        int j = mid + 1; // iteration for right
        int k = 0; // for temp array
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
        // for remaining right part
        while (i <= mid) {
            temp[k++] = array[i++];

        }
        while (j <= ei) {
            temp[k++] = array[j++];

        }
        // copy to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            array[i] = temp[k];

        }

    }

    public static void main(String[] args) {
        int array[] = { 6, 3, 9, 5, 2, 8 };
        merseSort(array, 0, array.length - 1);
        printArr(array);

    }

}
