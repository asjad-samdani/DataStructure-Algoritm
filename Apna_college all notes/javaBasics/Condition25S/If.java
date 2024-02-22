// package Condition25.09;

public class If {
    public static void main(String[] args) {
        int age = 20;
        if (age > 18) {
            System.out.println("Adult: Drive ");

        } else if (age > 13 && age > 18) {
            System.out.println("Teeneger");
        } else {
            System.out.println("Not adult");
        }
    }
}