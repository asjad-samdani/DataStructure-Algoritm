package Funtions;

import java.util.Scanner;

public class Multiply {

    public static int multiPly(int a, int b) {
        int product = a * b;
        return product;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int pro = multiPly(num, num2);
        System.out.println("Product is :" + pro);
        pro = multiPly(100, 200);
        System.out.println("Product is :" + pro);

        sc.close();
    }

}
