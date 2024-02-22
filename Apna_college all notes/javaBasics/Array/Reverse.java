package Array;
class Reverse {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        // char[] ch = { 'A', 'B', 'c' };
        // reverseString(ch);
        // System.out.println(ch);
        String name = "Asjad";
        char[] charArray = name.toCharArray();
        reverseString(charArray);
        System.out.println(charArray);
    }

}