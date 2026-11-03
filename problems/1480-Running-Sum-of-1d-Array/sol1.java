// ==========================================================
// 1480. Running Sum of 1d Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.9 MB (Beats 76%)
// Link       : https://leetcode.com/problems/running-sum-of-1d-array/
// ==========================================================

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}