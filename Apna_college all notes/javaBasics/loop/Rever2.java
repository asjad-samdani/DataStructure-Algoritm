import java.util.Scanner;

public class Rever2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int rev = 0;
        while (range <0) {
            int lastdigit = range % 10;
            rev = lastdigit + (rev * 10);
            range = range / 10;
            range++;

        }
        System.out.println(rev);
        sc.close();
    }

}
