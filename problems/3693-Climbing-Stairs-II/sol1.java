// ==========================================================
// 3693. Climbing Stairs II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 13 ms (Beats 45%)
// Memory     : 116.4 MB (Beats 83%)
// Link       : https://leetcode.com/problems/climbing-stairs-ii/
// ==========================================================

class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= 3; j++) {
                if (i - j >= 0) {
                    int jumpCost = costs[i - 1] + j * j;
                    dp[i] = Math.min(dp[i], dp[i - j] + jumpCost);
                }
            }
        }
        return dp[n];
    }
}
