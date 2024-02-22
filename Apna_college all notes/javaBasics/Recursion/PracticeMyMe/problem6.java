package Recursion.PracticeMyMe;

public class problem6 {
    static String Digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printNumbertoWord(int numbers) {
        if (numbers == 0) {
            return;
        }
        int lastDigit = numbers % 10;
        printNumbertoWord(numbers / 10);
        System.out.println(Digit[lastDigit] + " ");

    }

    public static void main(String[] args) {
        int numbers = 1010;
        printNumbertoWord(numbers);
        System.out.println();
    }

}
