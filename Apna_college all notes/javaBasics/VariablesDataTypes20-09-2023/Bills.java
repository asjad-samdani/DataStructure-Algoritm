
import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of items");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        sc.close();
        

        float total = pencil + pen + eraser;
        System.out.println("The price of pencil,pen,eraser is :" + total);
        float newTotal = total + (0.18f + total);
        System.out.println("Bill with 18% txt:" + newTotal);
    }

}
