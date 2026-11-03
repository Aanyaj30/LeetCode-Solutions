// ==========================================================
// 1464. Maximum Product of Two Elements in an Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 6 ms (Beats 15%)
// Memory     : 44 MB (Beats 87%)
// Link       : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
// ==========================================================

class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                max = Math.max(max, (nums[i]-1) * (nums[j]-1));
            }
        }
        return max;
    }
}