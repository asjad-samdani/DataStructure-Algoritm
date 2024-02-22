package GreedyMethod;

import java.util.*;

public class Indianscoin {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50,200 ,100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfcoin = 0;
        int amount = 300;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfcoin++;
                    ans.add(coins[i]);
                    amount -= coins[i];

                }

            }
        }
        System.out.println("Total min coins are used " + countOfcoin);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

}
