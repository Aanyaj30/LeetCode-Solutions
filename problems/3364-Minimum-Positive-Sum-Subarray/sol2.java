// ==========================================================
// 3364. Minimum Positive Sum Subarray 
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 4 ms (Beats 76%)
// Memory     : 45.8 MB (Beats 80%)
// Link       : https://leetcode.com/problems/minimum-positive-sum-subarray/
// ==========================================================

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;
        for (int k = l; k <= r; k++) {
            int sum = 0;
            // First window
            for (int i = 0; i < k; i++) {
                sum += nums.get(i);
            }
            if (sum > 0) {
                ans = Math.min(ans, sum);
            }
            // Slide the window
            for (int i = k; i < n; i++) {
                sum += nums.get(i);
                sum -= nums.get(i - k);
                if (sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
