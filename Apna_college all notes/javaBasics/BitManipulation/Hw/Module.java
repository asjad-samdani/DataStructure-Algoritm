package BitManipulation.Hw;

public class Module {
    static int module(int a, int b, int x) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                res = res * a;
            b = b >> 1;
            a = a * a;

        }
        return res % x;

    }

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int x = 13;
        System.out.println("power is " + module(a, b, x));

    }

}
