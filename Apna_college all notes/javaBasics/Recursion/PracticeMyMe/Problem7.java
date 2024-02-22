package Recursion.PracticeMyMe;

public class Problem7 {
    public static int power(int a, int x) {
        if (x == 0) {
            return 1;

        }
        int Sm1 = power(a, x - 1);
        int sn = a* Sm1;
        return sn;
        // return a*power(a, x-1);
    }

    public static void main(String[] args) {
        int a = 2;
        int x = 5;
        System.out.println(power(a, x));
    }

}
