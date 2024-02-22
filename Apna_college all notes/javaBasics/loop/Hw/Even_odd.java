package Hw;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int even_sum = 0;
        int odd_sum = 0;
        do {
            System.out.println("Enter number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                even_sum += number;
                // number++;

            } else {
                odd_sum += number;
                // number++;
            }
            System.out.println("Do you want to continue ? Press 1 to yess 0 for No");
            choice = sc.nextInt();

        } while (choice == 1);
        System.out.println("Sum of even no : " + even_sum);
        System.out.println("Sum of odd no : " + odd_sum);
        sc.close();

    }

}
