package Funtions.Hw;

import java.util.Scanner;

public class Hollow {
    public static void hollowRectabgle(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == a || j == 1 || j == b) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int ractangle = sc.nextInt();
        System.out.println("Enter column");
        int second_rectangle = sc.nextInt();
        hollowRectabgle(ractangle, second_rectangle);
        sc.close();

    }

}
