package Backtracking;

public class Findsubset {
    public static void findSubsets(String str, String ans, int i) {
        // Base Case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;

        }
        // yess choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // No choice
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "a";
        findSubsets(str, "", 0);

    }

}
