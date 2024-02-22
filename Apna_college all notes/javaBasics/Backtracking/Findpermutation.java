package Backtracking;

public class Findpermutation {
    public static void findpermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            findpermutation(Newstr, ans + curr);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        findpermutation(str, "");
    }

}
