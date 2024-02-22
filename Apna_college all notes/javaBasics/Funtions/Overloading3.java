package Funtions;

public class Overloading3 {
    public static int myMethod(int x, int y) {
        return x + y;
    }

    public static double myMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = myMethod(6, 8);
        double myNum2 = myMethod(4.5, 8.4);
        System.out.println("int :" + myNum1);
        System.out.println("Double :" + myNum2);
    }

}
