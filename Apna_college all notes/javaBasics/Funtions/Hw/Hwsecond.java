package Funtions.Hw;

import java.util.Scanner;

//Solve my me
public class Hwsecond {
    // public static boolean isEven(int n) {
    // if (n % 2 == 0) {
    // return true;

    // }
    // return false;
    // }

    // public static void main(String[] args) {
    // System.out.println(isEven(11));

    // }

    // solve by Teacher
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer");
        num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("Number is even");

        } else {
            System.out.println("Number is odd");
        }
sc.close();
    }
}