package Nested_loop;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbera of star");
        int a = sc.nextInt();
        for (int i = 1; i <=a; i++) {

            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (a - i);

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // 2nd Half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        // lower half
        for (int i = a; i >= 1; i--) {

            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (a - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // 2nd Half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }

    }

}
