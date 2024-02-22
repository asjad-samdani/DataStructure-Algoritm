// package loop;

import java.util.Scanner;

public class Natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural number");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum +=i;
            i++;
        }
        System.out.println("Sum is " + sum);
        sc.close();
    }

}