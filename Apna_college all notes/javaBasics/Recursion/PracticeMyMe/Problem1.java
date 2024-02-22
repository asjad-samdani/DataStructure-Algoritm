package Recursion.PracticeMyMe;

public class Problem1 {
    public static void printNumber(int n) {
        if (n == 1) {
            return;
        }
        System.out.print(n + " ");
        printNumber(n - 1);

    }

    public static void main(String[] args) {
        int n = 10;

        printNumber(n);
    }

}
