// ==========================================================
// 2911. Minimum Changes to Make K Semi-palindromes
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 157 ms (Beats 73%)
// Memory     : 46 MB (Beats 93%)
// Link       : https://leetcode.com/problems/minimum-changes-to-make-k-semi-palindromes/
// ==========================================================


class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();

        int[][] cost = new int[n][n];

        // Precompute cost of every substring
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len <= n; i++) {

                int best = Integer.MAX_VALUE;

                for (int d = 1; d < len; d++) {

                    if (len % d != 0) continue;

                    int changes = 0;

                    for (int r = 0; r < d; r++) {

                        int left = i + r;
                        int right = i + len - d + r;

                        while (left < right) {

                            if (s.charAt(left) != s.charAt(right)) {
                                changes++;
                            }

                            left += d;
                            right -= d;
                        }
                    }

                    best = Math.min(best, changes);
                }

                cost[i][i + len - 1] = best;
            }
        }

        // DP
        int INF = 1000000;

        int[][] dp = new int[n + 1][k + 1];

        for (int[] row : dp) {
            java.util.Arrays.fill(row, INF);
        }

        dp[0][0] = 0;

        for (int i = 2; i <= n; i++) {

            for (int parts = 1; parts <= k; parts++) {

                for (int len = 2; len <= i; len++) {

                    if (dp[i - len][parts - 1] == INF) {
                        continue;
                    }

                    dp[i][parts] = Math.min(
                        dp[i][parts],
                        dp[i - len][parts - 1] + cost[i - len][i - 1]
                    );
                }
            }
        }

        return dp[n][k];
    }
}
