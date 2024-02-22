import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num among 10,20 & 30");
        int num = sc.nextInt();
        switch (num) {
            case 10:
                System.out.println("Number Enter by End User is 10");
                break;
            case 20:
                System.out.println("Number Enter by End User is 20");
                break;
            case 30:
                System.out.println("Number Enter by End User is 30");
                break;

            default:
                System.out.println("Invalid value : ");
                break;
        }
        sc.close();
    }

}
