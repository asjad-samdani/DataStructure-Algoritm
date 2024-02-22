import java.util.Scanner;

public class Posotive_neagai {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("The number is posetive");

            
        }else{
            System.out.println("The no is negative");
        }
        sc.close();
    }
    
}
