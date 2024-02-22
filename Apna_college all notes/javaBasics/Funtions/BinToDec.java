package Funtions;

import java.util.Scanner;

public class BinToDec {
    public static void binToDec(int n) {
        int pow = 0;
        int decNum = 0;
        int myNum = n;

        while (n > 0) {
            int lastDigit = n % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;

        }
        System.out.println("Decimal of " + myNum + "=" + decNum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number");
        int a = sc.nextInt();
        binToDec(a);
        sc.close();

    }

}
