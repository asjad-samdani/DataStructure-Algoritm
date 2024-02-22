package Recursion;

public class ConsectiveZero {
    public static void consecutiveOnces(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        consecutiveOnces(n - 1, 0, str + "1");
        if (lastplace == 0) {
            consecutiveOnces(n - 1, 1, str + "0");

        }
    }

    public static void main(String[] args) {
        consecutiveOnces(3, 0, "");

    }

}
