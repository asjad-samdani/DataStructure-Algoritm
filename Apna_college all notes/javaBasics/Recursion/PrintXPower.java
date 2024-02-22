package Recursion;

public class PrintXPower {
    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1 = xPower(x, n - 1);
        // int xn = x * xnm1;
        // return xn;
        return x * Power(x, n - 1);

    }

    public static void main(String[] args) {

        {
            int x = 5;
            int n = 2;
            System.out.println(Power(x, n));

        }

    }
}