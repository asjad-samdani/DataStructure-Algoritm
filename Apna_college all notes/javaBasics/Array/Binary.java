package Array;

public class Binary {
    public static int binaryNumber(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 10, 20, 30, 40, 50, 60 };
        int key = 60;
        int index = binaryNumber(numbers, key);

        System.out.println("Key found at :" + index);

    }

}
