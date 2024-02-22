import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("The largest number is :A");

        } else if (b >= c) {
            System.out.println("The largest number is :B");

        } else {
            System.out.println("The largest number is :C");
        }
        sc.close();
    }

}
