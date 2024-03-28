package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        int amount = 590;
        int cntCoins = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                cntCoins++;
                ans.add(coins[i]);
                amount -= coins[i];
            }

        }
        System.out.println("Total coins is=" + cntCoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
