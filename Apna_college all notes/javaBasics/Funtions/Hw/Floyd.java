package Funtions.Hw;

import java.util.Scanner;

public class Floyd {
    public static void floyd_Triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // floyd_Triangle(6);
        Scanner sc = new Scanner(System.in);
        int Floyd = sc.nextInt();
        floyd_Triangle(Floyd);
        sc.close();
    }

}
