package Recursion.PracticeMyMe;

public class Problem8 {
    public static int sumOfNum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNum(n - 1);
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(sumOfNum(n));

    }

}
