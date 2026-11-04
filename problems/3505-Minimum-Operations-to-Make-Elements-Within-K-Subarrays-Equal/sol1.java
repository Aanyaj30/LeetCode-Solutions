// ==========================================================
// 3505. Minimum Operations to Make Elements Within K Subarrays Equal
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 981 ms (Beats 18%)
// Memory     : 170.7 MB (Beats 61%)
// Link       : https://leetcode.com/problems/minimum-operations-to-make-elements-within-k-subarrays-equal/
// ==========================================================

import java.util.*;

class Solution {

    class Window {
        TreeMap<Integer, Integer> left = new TreeMap<>();
        TreeMap<Integer, Integer> right = new TreeMap<>();

        int sizeLeft = 0, sizeRight = 0;
        long sumLeft = 0, sumRight = 0;

        void addMap(TreeMap<Integer, Integer> map, int val) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        void removeMap(TreeMap<Integer, Integer> map, int val) {
            int count = map.get(val);

            if (count == 1) {
                map.remove(val);
            } else {
                map.put(val, count - 1);
            }
        }

        void add(int val) {
            if (left.isEmpty() || val <= left.lastKey()) {
                addMap(left, val);
                sizeLeft++;
                sumLeft += val;
            } else {
                addMap(right, val);
                sizeRight++;
                sumRight += val;
            }

            balance();
        }

        void remove(int val) {
            if (left.containsKey(val)) {
                removeMap(left, val);
                sizeLeft--;
                sumLeft -= val;
            } else {
                removeMap(right, val);
                sizeRight--;
                sumRight -= val;
            }

            balance();
        }

        void balance() {
            int target = (sizeLeft + sizeRight + 1) / 2;

            while (sizeLeft > target) {
                int val = left.lastKey();

                removeMap(left, val);
                sizeLeft--;
                sumLeft -= val;

                addMap(right, val);
                sizeRight++;
                sumRight += val;
            }

            while (sizeLeft < target) {
                int val = right.firstKey();

                removeMap(right, val);
                sizeRight--;
                sumRight -= val;

                addMap(left, val);
                sizeLeft++;
                sumLeft += val;
            }
        }

        long getCost() {
            long median = left.lastKey();

            long costLeft = median * sizeLeft - sumLeft;
            long costRight = sumRight - median * sizeRight;

            return costLeft + costRight;
        }
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;

        // Step 1: Calculate cost of every window of size x

        long[] cost = new long[n - x + 1];

        Window window = new Window();

        for (int i = 0; i < n; i++) {

            window.add(nums[i]);

            if (i >= x) {
                window.remove(nums[i - x]);
            }

            if (i >= x - 1) {
                cost[i - x + 1] = window.getCost();
            }
        }

        // Step 2: Dynamic Programming

        long INF = Long.MAX_VALUE / 2;

        long[][] dp = new long[k + 1][n + 1];

        for (int j = 1; j <= k; j++) {
            Arrays.fill(dp[j], INF);
        }

        // dp[0][i] = 0 for all i

        for (int j = 1; j <= k; j++) {

            for (int i = 1; i <= n; i++) {

                // Don't select a window ending here
                dp[j][i] = dp[j][i - 1];

                // Select the window [i-x, i-1]
                if (i >= x && dp[j - 1][i - x] != INF) {

                    long take = dp[j - 1][i - x]
                              + cost[i - x];

                    dp[j][i] = Math.min(dp[j][i], take);
                }
            }
        }

        return dp[k][n];
    }
}
