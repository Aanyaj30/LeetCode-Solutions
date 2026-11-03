// ==========================================================
// 1929. Concatenation of Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 98%)
// Memory     : 46.5 MB (Beats 93%)
// Link       : https://leetcode.com/problems/concatenation-of-array/
// ==========================================================

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}