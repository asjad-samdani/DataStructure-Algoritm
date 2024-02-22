package Array;

public class Revers {
    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = (reverse * 10) + n % 10;
            n = n / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        int n = 987654321;
        int rev = reverseNumber(n);
        System.out.println("Reverse of number : " + rev);
        System.out.println();
    }
}