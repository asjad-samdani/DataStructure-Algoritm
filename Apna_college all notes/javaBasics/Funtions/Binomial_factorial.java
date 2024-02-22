package Funtions;

import java.util.Scanner;

public class Binomial_factorial {

    public static int facto(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;

        }
        return fac;

    }

    public static int Binomial(int n, int r) {
        int fact_n = facto(n);
        int fact_r = facto(r);
        int fact_nmr = facto(n - r);
        int factorial = fact_n / (fact_r * fact_nmr);
        return factorial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        System.out.println("Enter r value");
        int r = sc.nextInt();
        System.out.println("Binomial coefficient :" + Binomial(n, r));
        sc.close();

    }

}
