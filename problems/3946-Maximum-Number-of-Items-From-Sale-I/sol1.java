// ==========================================================
// 3946. Maximum Number of Items From Sale I
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 14 ms (Beats 92%)
// Memory     : 46.3 MB (Beats 91%)
// Link       : https://leetcode.com/problems/maximum-number-of-items-from-sale-i/
// ==========================================================

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int maxFactor = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            maxFactor = Math.max(maxFactor, item[0]);
            minPrice = Math.min(minPrice, item[1]);
        }

        // Count how many items have each factor
        int[] freq = new int[maxFactor + 1];

        for (int[] item : items) {
            freq[item[0]]++;
        }

        // Calculate the free items gained by activating each item
        int[] free = new int[n];

        for (int i = 0; i < n; i++) {
            int factor = items[i][0];
            int count = 0;

            for (int mult = factor; mult <= maxFactor; mult += factor) {
                count += freq[mult];
            }

            free[i] = count - 1;
        }

        // 0/1 Knapsack
        int[] dp = new int[budget + 1];
        java.util.Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int price = items[i][1];
            int value = 1 + free[i];

            for (int c = budget; c >= price; c--) {
                if (dp[c - price] != -1) {
                    dp[c] = Math.max(dp[c], dp[c - price] + value);
                }
            }
        }

        // Use leftover money to buy the cheapest item
        int ans = 0;

        for (int c = 0; c <= budget; c++) {
            if (dp[c] != -1) {
                int total = dp[c] + (budget - c) / minPrice;
                ans = Math.max(ans, total);
            }
        }

        return ans;
    }
}