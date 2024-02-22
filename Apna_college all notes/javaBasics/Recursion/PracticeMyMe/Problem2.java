package Recursion.PracticeMyMe;

public class Problem2 {
    public static void printNumber2(int n) {
        if (n == 0) {
            return;
          }
        printNumber2(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printNumber2(n);

    }

}
