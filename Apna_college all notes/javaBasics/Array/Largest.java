package Array;

import java.util.Scanner;

public class Largest {
    public static int lagestNumber(int numbers[]) {
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (lar < numbers[i]) {
                lar = numbers[i];

            }
        }
        return lar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter array element");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        // int numbers[] = { 10, 20, 40, 60, 30 };
        System.out.println("Largest value is : " + lagestNumber(numbers));
        sc.close();
    }
}
