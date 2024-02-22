package Divide_Conquer;

public class LinearRotated {
    public static int rotatedSearch(int array[], int tar) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == tar) {
                return i;

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 5, 6, 7, 8, 9 };
        int tar = 2;
        int index = rotatedSearch(array, tar);
        System.out.println(index);

    }

}
