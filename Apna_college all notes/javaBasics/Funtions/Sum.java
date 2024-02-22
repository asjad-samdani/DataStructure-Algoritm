package Funtions;

import java.util.Scanner;

public class Sum {
    // public static void calculateSum(){
    // Scanner sc= new Scanner(System.in);
    // int a= sc.nextInt();
    // int b=sc.nextInt();
    // int sum= a+b;
    // System.out.println("Sum is:"+sum);

    // }
    // public static void main(String[]args){
    // calculateSum();

    // }

    public static int calculateSum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum is :" + sum);
        sc.close();

    }

}
