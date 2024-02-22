package GreedyMethod;

import java.util.Arrays;
import java.util.Comparator;

public class Frac {
    public static void main(String[] args) {
        int val[] = { 60, 10, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;
        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        // Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalValue = 0;
        // decending order
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalValue += val[idx];
                capacity -= weight[idx];

            } else {
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final value is " + finalValue);

    }

}
