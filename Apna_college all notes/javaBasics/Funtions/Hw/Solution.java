package Funtions.Hw;

import java.util.Scanner;

public class Solution {
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverage = 0;
        while (palindrome != 0) {
            int reminder = palindrome % 10;
            reverage = reminder * 10 + reminder;
            palindrome = palindrome / 10;

        }
        if (number == reverage) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Please Enter a number :");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if (isPalindrome(palindrome)) {
            System.out.println("Number " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number " + palindrome + " is a not palindrome");

        }
        sc.close();
    }
}
