package Recursion;

public class CovertStringToWord {
    static String digit[] = { "zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigit(int numbers) {
        if (numbers == 0) {
            return;

        }
        int lastDigit = numbers % 10;
        printDigit(numbers / 10);
        System.out.print(digit[lastDigit]+" ");

    }

    public static void main(String[] args) {
        int numbers = 9986;
        printDigit(numbers);
        System.out.println();

    }

}
