import java.util.Scanner;

public class Reverseno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        
        while (number > 0) {
            int lastdigit = number % 10;
            System.out.print(lastdigit+ " ");
            number = number / 10;

        }
        System.out.println();
        sc.close();

    }

}
