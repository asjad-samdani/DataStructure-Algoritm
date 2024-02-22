package TimeAndSpace;

import java.util.Arrays;

public class Largest {
    public static int getLargest(int[] array, int n) {
        Arrays.sort(array);
        return array[n - 1];
    }

    public static void main(String args[]) {
        int array[] = { 44, 66, 99, 77, 33, 22, 55 };
        int n = array.length;
        System.out.println(getLargest(array, n));
    }
}

// Time complexity ---- O(1)
