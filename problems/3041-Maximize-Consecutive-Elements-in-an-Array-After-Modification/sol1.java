// ==========================================================
// 3041. Maximize Consecutive Elements in an Array After Modification
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 90 ms (Beats 61%)
// Memory     : 116.6 MB (Beats 36%)
// Link       : https://leetcode.com/problems/maximize-consecutive-elements-in-an-array-after-modification/
// ==========================================================

class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> dp = new HashMap<>();
        int ans = 1;
        for (int x : nums) {
            dp.put(x + 1, dp.getOrDefault(x, 0) + 1);
            dp.put(x, dp.getOrDefault(x - 1, 0) + 1);
            ans = Math.max(ans, dp.get(x));
            ans = Math.max(ans, dp.get(x + 1));
        }
        return ans;
    }
}