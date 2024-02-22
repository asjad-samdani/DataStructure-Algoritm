package TwoDArray;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int twoDArray[][] = new int[3][3];
        int n = twoDArray.length, m = twoDArray.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 * 3 Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoDArray[i][j] = sc.nextInt();
            }
        }
        // Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
