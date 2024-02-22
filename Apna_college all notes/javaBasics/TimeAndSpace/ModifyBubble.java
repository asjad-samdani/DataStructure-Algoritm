package TimeAndSpace;

public class ModifyBubble {
    public static void modifyBubble(int array[]) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;

                }
            }
            if (swapped == false) {
                break;

            }
        }
    }

    public static void printArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 54, 8, 10 };
        modifyBubble(array);
        printArray(array);
    }

}
