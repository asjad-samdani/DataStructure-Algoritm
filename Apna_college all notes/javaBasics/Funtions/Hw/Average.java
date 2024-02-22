package Funtions.Hw;

import java.util.Scanner;

public class Average {
    public static double averageOfNumber(double a, double b, double c) {
        double avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        double a = sc.nextDouble();
        System.out.println("Enter 2nd Number");
        double b = sc.nextDouble();
        System.out.println("Enter 3rd Number");
        double c = sc.nextDouble();
        System.out.print("The average value is = " + averageOfNumber(a, b, c) + "\n");
        sc.close();

    }

}
