package String;

public class Substring {
    public static String suString(String str, int si, int end) {
        String subStr = "";
        for (int i = si; i < end; i++) {
            subStr += str.charAt(i);
        }
        return subStr;

    }

    public static void main(String[] args) {
        String str = "Hello world";
        /*
         * inbuild java function---->
         * 
         * String substr = str.substring(0, 2);
         * System.out.println(substr);
         */

        System.out.println(suString(str, 2, 3));
    }

}
