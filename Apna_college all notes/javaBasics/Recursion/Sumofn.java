package Recursion;

public class Sumofn {
    public static int sumOfNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 =n+ sumOfNumber(n - 1);
        // int Sn = n + Snm1;
        return Snm1;

    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(sumOfNumber(n));

    }

}
