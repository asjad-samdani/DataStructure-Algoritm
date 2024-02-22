package Array;

public class Reversearray {
    // public static void reverse(char []c) {
    // int start = 0;
    // int end = c.length - 1;
    // while (start < end) {
    // // Swapping
    // // temp = numbers[end];
    // // numbers[end] = numbers[start];
    // // numbers[start] = temp;
    // // start++;
    // // end--;
    // char ch = c[start];
    // c[start] = c[end];
    // c[end] = ch;
    // }
    // }
    public static String reverse(String str) {
        char ch[] = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            char c = ch[start];
            ch[start] = ch[end];
            ch[end] = c;
            start++;
            end--;

        }
        return new String(ch);
    }

    public static void main(String[] args) {
        char ch[] = { 'A', 's', 'j', 'a', 'd' };
        reverse(null);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();
    }

}
