package Nested_loop;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 1) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }

            }
            System.out.println();
            sc.close();
        }

    }
}