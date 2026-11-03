// ==========================================================
// 1470. Shuffle the Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 45.9 MB (Beats 96%)
// Link       : https://leetcode.com/problems/shuffle-the-array/
// ==========================================================

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[2*n];
        for(int i=0; i<n; i++){
            result[2*i] = nums[i];
            result[2*i+1] = nums[i+n];
        }
        return result;
    }
}