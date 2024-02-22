package Funtions;

import java.util.Scanner;

public class PrimeRange {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
 
            }
        }
        return true;

    }

    public static void PrimeinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {// condition true
                System.out.print(i + " ");

            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        PrimeinRange(a);
        sc.close();
    }

}
