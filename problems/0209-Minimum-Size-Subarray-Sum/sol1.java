// ==========================================================
// 209. Minimum Size Subarray Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 69.2 MB (Beats 47%)
// Link       : https://leetcode.com/problems/minimum-size-subarray-sum/
// ==========================================================

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0, currSum=0;
        int minLen = Integer.MAX_VALUE;
        for(int end=0; end<nums.length; end++){
            currSum += nums[end];
            while(currSum >= target){
                minLen = Math.min(minLen, end-start+1);
                currSum -= nums[start];
                start += 1;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}