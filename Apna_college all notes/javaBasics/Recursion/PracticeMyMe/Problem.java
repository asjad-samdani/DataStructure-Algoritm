package Recursion.PracticeMyMe;

public class Problem {
    public static int factorialNo(int n) {
        if (n == 1) {
            return 1;

        }
        int Sn = n + factorialNo(n - 1);
        return Sn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialNo(n));

    }

}
