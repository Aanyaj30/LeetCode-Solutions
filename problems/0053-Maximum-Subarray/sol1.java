// ==========================================================
// 53. Maximum Subarray
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 76.7 MB (Beats 77%)
// Link       : https://leetcode.com/problems/maximum-subarray/
// ==========================================================

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i=1; i<nums.length; i++){
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}