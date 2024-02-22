package Funtions;
public class Palindrome {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x/= 10;

        }
        return reverse == temp;

    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }

}
