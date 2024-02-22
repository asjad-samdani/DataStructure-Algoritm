package TwoDArray.Hw;

public class Duplicate {
    public static void main(String[] args) {
        int array[] = { 1, 3, 2, 3, 2, 1, 5, 6, 4, 6 };
        System.out.println("Duplicate elements are :");
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j] + " ");

                }
            }
        }

    }
}
