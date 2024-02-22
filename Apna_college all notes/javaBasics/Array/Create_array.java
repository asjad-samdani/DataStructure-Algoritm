package Array;

import java.util.Scanner;

public class Create_array {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        System.out.println("Marks of phy " + marks[0]);
        System.out.println("Marks of math " + marks[1]);
        System.out.println("Marks of urdu " + marks[2]);
        System.out.println("Marks of Hindi " + marks[3]);
        // Update the value of marks
        // marks[3] = 98;
        // System.out.println("Marks of Hindi " + marks[3]);
        // // update
        // marks[2] = marks[2] + 1;
        // System.out.println("Marks of urdu " + marks[2]);
        sc.close();

        // percentage of marks
        int percentage = (marks[0] + marks[1] + marks[2] + marks[3]) / 3;
        System.out.println("Percentage =" + percentage + "%");
        System.out.println("length of array : " + marks.length);

    }

}
