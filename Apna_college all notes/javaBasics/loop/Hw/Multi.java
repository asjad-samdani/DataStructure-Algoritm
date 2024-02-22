package Hw;

import java.util.Scanner;

public class Multi {
    public static void printMultiplicationTable(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " into " + i + "=" + n * i);

            sc.close();
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable(5);

    }

}
