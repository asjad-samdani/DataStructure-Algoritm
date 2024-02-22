import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        // System.out.println("****");
        // }
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int i = 1;
        while (i <= count) {
            System.out.println("%%%%");
            i++;
        }
        sc.close();

    }
}
