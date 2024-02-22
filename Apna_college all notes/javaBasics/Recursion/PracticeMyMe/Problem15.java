package Recursion.PracticeMyMe;

public class Problem15 {
    public static void printOnces(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;

        }
        printOnces(n - 1, 0, str + "1");
        if (lastplace == 0) {
            printOnces(n - 1, 1, str + "0");

        }

    }

    public static void main(String[] args) {
        printOnces(3, 0, "");

    }

}
