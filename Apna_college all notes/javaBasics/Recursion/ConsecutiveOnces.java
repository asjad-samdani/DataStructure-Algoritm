package Recursion;

public class ConsecutiveOnces {
    public static void consecutiveOnces(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        consecutiveOnces(n - 1, 0, str + "0");
        if (lastplace == 0) {
            consecutiveOnces(n - 1, 1, str + "1");

        }
    }

    public static void main(String[] args) {
        consecutiveOnces(3, 0, "");

    }

}
