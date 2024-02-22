package String;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        StringBuilder sb1 = reverseStringBuilder(sb);
        System.out.println(sb1.toString());
    }

    public static StringBuilder reverseStringBuilder(StringBuilder input) {
        StringBuilder reversed = new StringBuilder("");
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed;
    }
}
