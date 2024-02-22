package Funtions;

public class Binomial {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int Binomcoeff(int n, int r) {
        int n_factorial = factorial(n);
        int r_factorial = factorial(r);
        int nmr_factorial = factorial(n - r);
        int bio = n_factorial / (r_factorial * nmr_factorial);
        return bio;

    }

    public static void main(String[] args) {
        System.out.println(Binomcoeff(5, 2));

    }
}
