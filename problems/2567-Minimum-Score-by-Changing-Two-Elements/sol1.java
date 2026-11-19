// ==========================================================
// 2567. Minimum Score by Changing Two Elements
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 18 ms (Beats 89%)
// Memory     : 59.1 MB (Beats 93%)
// Link       : https://leetcode.com/problems/minimum-score-by-changing-two-elements/
// ==========================================================

class Solution {

    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.min(
            Math.min(nums[n - 3] - nums[0], nums[n - 2] - nums[1]),
            nums[n - 1] - nums[2]
        );
    }
}