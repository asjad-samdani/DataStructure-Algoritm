package Array;

public class LinearSearch {
    public static int linerSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 20, 30, 40, 50, 60 };
        int key = 40;
        // int index = linerSearch(numbers, key);
        int index=linerSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not found");

        } else {
            System.out.println("Key is at : " + index);
        }
    }

}
