package Recursion.PracticeMyMe;

public class Practice10 {
    public static int optimizePower(int a, int x) {
        if (x == 0) {
            return 1;
        }
        int halfPower = optimizePower(a, x / 2);
        int halfPowerSq = halfPower * halfPower;
        if (x % 2 != 0) {
            halfPowerSq = a * halfPowerSq;

        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int x = 10;
        System.out.println(optimizePower(a, x));

    }

}
