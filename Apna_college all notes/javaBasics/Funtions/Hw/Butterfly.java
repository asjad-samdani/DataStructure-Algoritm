package Funtions.Hw;

import java.util.Scanner;

public class Butterfly {
    public static void butterfly(int n) {

        for (int i = 1; i <= n; i++) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower
        for (int i = n; i >= 1; i--) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // butterfly(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numers");
        int butt = sc.nextInt();
        butterfly(butt);
        sc.close();
    }

}
