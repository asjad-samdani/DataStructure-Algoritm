package Array;

public class Kadan {
    public static int kadanAlgorithm(int numbers[]) {
        // int ms = Integer.MIN_VALUE;
        // int cs = 0;
        // for (int i = 0; i < numbers.length; i++) {
        // cs = cs + numbers[i];
        // if (cs < 0) {
        // cs = 0;
        // }
        // ms = Math.max(cs, ms);
        // }
        // System.out.println("Our max subarray sum is :" + ms);
        // }

        int maximum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currentsum += numbers[i];

            if (currentsum > maximum) {
                maximum = currentsum;
            }
            if (currentsum < 0) {
                currentsum = 0;
            }
            maximum = Math.max(currentsum, maximum);

        }
        return maximum;
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 7, -1, -2, 1, 10, -3 };
        System.out.println(kadanAlgorithm(numbers));
    }

}
