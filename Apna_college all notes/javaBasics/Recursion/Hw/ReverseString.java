package Recursion.Hw;

public class ReverseString {
    public static void printRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;

        }
        System.out.print(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "asjad";
        printRev(str, str.length() - 1);

    }

}
// time complexity = string length