package Funtions.Hw;

import java.util.Scanner;

public class Sum {
    public static int sumDigit(int n) {
        int sumOfDigit = 0;
        int lastDigit = n % 10;
        while (n > 0) {
            sumOfDigit += lastDigit;
            n /= 10;
            // sumOfDigit++;

        }
        return sumOfDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer");
        int digit = sc.nextInt();
        System.out.println("The sum is " + sumDigit(digit));
            sc.close();

    }

}
