package Recursion.PracticeMyMe;

public class Problem3 {
    public static int factorialNo(int n) {
        if (n == 0 || n == 1) {
            return n;
          }
        int fnm1 = factorialNo(n - 1) + factorialNo(n -2);
        return fnm1;
     }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(factorialNo(n));
    }

}
