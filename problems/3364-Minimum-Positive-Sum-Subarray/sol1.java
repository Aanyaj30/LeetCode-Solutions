// ==========================================================
// 3364. Minimum Positive Sum Subarray 
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 53%)
// Memory     : 46.1 MB (Beats 68%)
// Link       : https://leetcode.com/problems/minimum-positive-sum-subarray/
// ==========================================================


class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += nums.get(j);

                int len = j - i + 1;

                if (len >= l && len <= r && sum > 0) {
                    ans = Math.min(ans, sum);
                }

                if (len > r) {
                    break;
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
