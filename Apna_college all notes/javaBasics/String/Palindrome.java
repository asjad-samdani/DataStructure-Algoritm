package String;

import Nested_loop.Character;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(n - i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Noon";
        System.out.println(isPalindrome(str));
    }

}
