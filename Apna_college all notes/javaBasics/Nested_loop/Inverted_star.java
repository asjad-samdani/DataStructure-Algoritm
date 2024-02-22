package Nested_loop;

import java.util.Scanner;

public class Inverted_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter star number which you want to print");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");

            }
            System.out.println();
            sc.close();

        }
    }

}
