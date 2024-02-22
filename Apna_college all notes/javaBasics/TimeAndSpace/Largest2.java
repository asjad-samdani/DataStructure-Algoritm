package TimeAndSpace;

public class Largest2 {
    public static int getLargest(int array[], int n) {
        if (n == 1) {
            return array[0];

        }
        return Math.max(array[n - 1], getLargest(array, n - 1));
    }

    public static void main(String[] args) {
        int array[] = {1,20, 2, 4, 6, 7, 10 };
        int n = array.length;
        System.out.println(getLargest(array, n));
    }

}
