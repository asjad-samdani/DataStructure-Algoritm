package GreedyMethod;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;
        double ratio[][] = new double[val.length][2];

        // 0th -> idx 1st-> ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] /(double) weight[i];

        }
        //Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalValue = 0;

        //Decending order

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalValue += val[idx];
                capacity -= weight[idx];

            } else {
                // including fractional
                finalValue += (ratio[i][1] * capacity);
                capacity = 10;
                break;
            }

        }
        System.out.println("Final value = " + finalValue);
    }

}
