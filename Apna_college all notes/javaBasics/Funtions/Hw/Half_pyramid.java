package Funtions.Hw;

import java.util.Scanner;

public class Half_pyramid {
    public static void inverted_Half_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // inverted_Half_Pyramid(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number as you want print");
        int half_Pyramid = sc.nextInt();
        inverted_Half_Pyramid(half_Pyramid);
        sc.close();
    }

}
