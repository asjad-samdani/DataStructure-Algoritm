package Recursion;

public class Printincr {
    public static void Increase(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        Increase(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        Increase(n);

    }

}
