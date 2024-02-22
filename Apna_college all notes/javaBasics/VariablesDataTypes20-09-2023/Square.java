import java.util.Scanner;

public class Square {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
       int sq = sc.nextInt();
       sc.close();
       int area=sq*sq;
       System.out.println("the result of sq area is :"+area);

    }
    
}
