package Recursion.PracticeMyMe;

public class Problem14 {
    public static void printzero(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;

        }
        printzero(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printzero(n - 1, 1, str + "1");

        }
    }

    public static void main(String[] args) {
        printzero(3, 0, "");

    }

}
