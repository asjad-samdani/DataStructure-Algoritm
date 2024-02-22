package Funtions;

import java.util.Scanner;

public class OptimizePrime {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int pr = sc.nextInt();
        boolean prime = isPrime(pr);
        System.out.println(prime);
        sc.close();

    }

}
