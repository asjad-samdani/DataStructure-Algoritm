package Recursion;

// Fibonacci series using recursion

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // int fibnm1 = fibonacci(n - 1) + fibonacci(n - 2);
        return fibonacci(n-1)+fibonacci(n-2);

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }

}
