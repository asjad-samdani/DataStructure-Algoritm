package Recursion;

public class OptimizePower {
    public static int optimizePower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizePower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;

        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int x = 5;
        System.out.println(optimizePower(a, x));

    }

}
