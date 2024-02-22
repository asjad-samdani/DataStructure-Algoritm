package Funtions;

import java.util.Scanner;

public class Factorial {
    
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Fac is :" + factorial(a));
        sc.close();
    }

}
