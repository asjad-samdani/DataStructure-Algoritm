package Recursion;

public class Tiling {
    public static int tilingProblem(int n) { // floor sixe 2xn
        if (n == 0 || n == 1) {
            return 1;
        }
        // int fnm1 = tilingProblem(n - 1);
        // int fnm2 = tilingProblem(n - 2);
        // int totalway = fnm1 + fnm2;
        // return totalway;
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(100));

    }
}
