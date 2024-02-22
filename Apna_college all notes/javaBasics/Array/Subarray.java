package Array;

public class Subarray {
    public static void printSubArray(int numbers[]) {
        int total_pairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {// print
                    System.out.print(numbers[k] + " ");// subarray
                }
                total_pairs++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pairs is: " + total_pairs);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12 };
        printSubArray(numbers);
    }

}
