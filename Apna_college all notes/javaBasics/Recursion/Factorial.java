package Recursion;

public class Factorial {
    public static int factorialNo(int n) {
        if (n == 0) {
            return 1;
        }
        // int fnm1 = factorialNo(n - 1);
        // int fn = n * factorialNo(n - 1);
        // return fn;
        return n * factorialNo(n - 1);

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialNo(n));
    }

}
