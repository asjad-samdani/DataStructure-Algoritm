import java.util.Scanner;

public class Leapyear {
    public static void main(String[]args){
        Scanner as=new Scanner(System.in);
        System.out.println("Input the year");
        int year= as.nextInt();
        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z= ((year%100==0) && (year%400==0));
        if (x&&(y||z)) {
            System.out.println(year+ " is leap year");            
        }else{
            System.out.println(year+ " Is not leap year");
        }
        as.close();
    }
    
}
