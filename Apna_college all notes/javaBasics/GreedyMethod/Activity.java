package GreedyMethod;

import java.util.ArrayList;

public class Activity {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 3, 6, 7, 9, 9 };
        // end activity are sorted
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st Activity
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // Activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];

            }
        }
        System.out.println("Max Activity =" + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i)+" ");

        }
        System.out.println();

    }

}
