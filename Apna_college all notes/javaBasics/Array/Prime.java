package Array;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter End : ");
        int b = Integer.parseInt(sc.nextLine());

        if ((a > b) || a <= 0 || b <= 0) {
            System.out.println("Provide valid input");
        } else {
            int i = 0, num = 0;
            String prime = "";

            for (i = a; i <= b; i++) {
                int counter = 0;
                num = i;
                while (num >= 1) {
                    if (i % num == 0)
                        counter++;
                    num--;
                }
                if (counter == 2)
                    prime = prime + i + " ";
            }

            System.out.println(prime);
        }
        sc.close();
    }

}
